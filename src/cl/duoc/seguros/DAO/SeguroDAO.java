
package cl.duoc.seguros.DAO;
import cl.duoc.seguros.basedatos.Conexion;
import cl.duoc.seguros.dominio.Seguro;
import java.sql.*;
     
//        insert into seguro('identificador', 'nombreCliente', 'costo', 'fechaVigencia')
//       values( seg.getIdentificador() , seg.getnombreCliente()  , seg.getcosto() ,
//               seg.getfechaVigencia());


public class SeguroDAO {

    ///CRUD de acceso a datos
    public static boolean crearSeguro(Seguro seg) {

        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConnection();
            System.out.println(seg.getNombreCliente() + " " + seg.getIdentificador());
            ps = con.prepareStatement("insert into paciente(rut,nombre,edad, temperatura) values(?,?,?,?)");
            ps.setString(1, seg.getIdentificador());
            ps.setString(2, seg.getNombreCliente());
            ps.setInt(3, seg.getCosto());
            ps.setString(4, seg.getFechaVigencia());
            
            ps.executeUpdate();
            resultado = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
            resultado = false;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                
                
            }
        }

        return resultado;

    }
}