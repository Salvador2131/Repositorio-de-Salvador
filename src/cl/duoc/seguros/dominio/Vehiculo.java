/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.seguros.dominio;

/**
 *
 * @author Salven
 */
public class Vehiculo {

    private String patente;
    private String marca;
    private int avaluo;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, int avaluo) {
        this.patente = patente;
        this.marca = marca;
        this.avaluo = avaluo;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the avaluo
     */
    public int getAvaluo() {
        return avaluo;
    }

    /**
     * @param avaluo the avaluo to set
     */
    public void setAvaluo(int avaluo) {
        this.avaluo = avaluo;
    }

}
