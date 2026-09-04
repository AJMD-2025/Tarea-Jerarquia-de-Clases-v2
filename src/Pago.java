public class Pago {

    private double precio;
    private double dinero;

    public Pago(double precio, double dinero) {
        this.precio = precio;
        this.dinero = dinero;
    }

    public boolean verificarPago() {
        return dinero >= precio;
    }

    public double calcularCambio() {
        return dinero - precio;
    }

    public double calcularFaltante() {
        return precio - dinero;
    }
}