
package cl.duoc.seguros.control;

import cl.duoc.seguros.DAO.SeguroDAO;
import cl.duoc.seguros.dominio.Seguro;

public class SeguroControl {
    public boolean IngresarSeguro(Seguro seg){
    
        //acciones de control
        //verificar si el paciente esta vigente en el hospital
    
        return SeguroDAO.crearSeguro(seg);
 }
}
