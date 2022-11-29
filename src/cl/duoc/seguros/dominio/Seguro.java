package cl.duoc.seguros.dominio;

/**
 *
 * @author Salven
 */
public abstract class Seguro implements Calculables {

private String identificador;
private String nombreCliente;
private int costo;
private String fechaVigencia;

    public Seguro() {
    }

    public Seguro(String identificador, String nombreCliente, int costo, String fechaVigencia) {
        this.identificador = identificador;
        this.nombreCliente = nombreCliente;
        this.costo = costo;
        this.fechaVigencia = fechaVigencia;
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * @return the fechaVigencia
     */
    public String getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     * @param fechaVigencia the fechaVigencia to set
     */
    public void setFechaVigencia(String fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

public abstract int totalPago();

}
