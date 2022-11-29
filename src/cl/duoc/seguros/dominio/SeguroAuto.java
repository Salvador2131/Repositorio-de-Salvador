package cl.duoc.seguros.dominio;

public class SeguroAuto extends Seguro {

    private Vehiculo vehiculo;

    public SeguroAuto(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public SeguroAuto(Vehiculo vehiculo, String identificador, String nombreCliente, int costo, String fechaVigencia) {
        super(identificador, nombreCliente, costo, fechaVigencia);
        this.vehiculo = vehiculo;
    }

    public SeguroAuto() {

        vehiculo = new Vehiculo();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int totalPago() {

        return 0;
    }

    public int calculableConSeguro() {

        return 0;
    }

// Metodo deducible en UF
//mostrar seguroauto
}
