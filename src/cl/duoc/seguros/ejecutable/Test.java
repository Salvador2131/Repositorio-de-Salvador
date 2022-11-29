
package cl.duoc.seguros.ejecutable;
import java.util.Scanner;
import cl.duoc.seguros.dominio.Seguro;
import cl.duoc.seguros.dominio.Calculables;
import cl.duoc.seguros.dominio.SeguroAuto;
import cl.duoc.seguros.dominio.SeguroVida;
import cl.duoc.seguros.dominio.Vehiculo;
/**
 * @author Salven
 */
public class Test {

    public static void main(String[] args) {

        SeguroVida sv = new SeguroVida();
        //totalPago tp = new totalPago();//
        int edad = 0;

        if(edad<= 1 && edad>=60)
            
        System.out.println("La persona tiene bono");
        System.out.println("El valor sin bono es de: "+sv.totalPago());

        if(edad>= 1 && edad<=60)
        System.out.println("La persona no tiene bono");
    }
   
    public static void main(Integer[] args) {
        
        SeguroVida sv = new SeguroVida();
        System.out.println("Estado:"+sv.totalPago());
        
    }
    
}

//else (edad >=1 && edad<=60);
//while(true ) 