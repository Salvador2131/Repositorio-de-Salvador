/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.seguros.dominio;

/**
 *
 * @author Salven
 */
public class SeguroVida extends Seguro {

    private String nombre;
    private int edad;
    private int valorMuerte;

    public SeguroVida() {
    }

    public SeguroVida(String nombre, int edad, int valorMuerte) {
        this.nombre = nombre;
        this.edad = edad;
        this.valorMuerte = valorMuerte;
    }

    public SeguroVida(String nombre, int edad, int valorMuerte, String identificador, String nombreCliente, int costo, String fechaVigencia) {
        super(identificador, nombreCliente, costo, fechaVigencia);
        this.nombre = nombre;
        this.edad = edad;
        this.valorMuerte = valorMuerte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getValorMuerte() {
        return valorMuerte;
    }

    public void setValorMuerte(int valorMuerte) {
        this.valorMuerte = valorMuerte;
    }

    public int totalPago() {

        int valorSinBono  = this.getValorMuerte() - this.getCosto();
        //valorSinBono sb = this.getValorMuerte() - this.getCosto();//

       // System.out.println("Total del pago por fallecimiento");
        //System.out.println("Valor de la muerte: " + 0);//

        return valorSinBono;
    }

    public int calculableConSeguro() {

        return 0;
    }
}
