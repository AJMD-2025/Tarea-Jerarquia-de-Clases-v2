public abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public abstract double calcularPrecioFinal();

    public boolean hayExistencia() {
        return cantidad > 0;
    }

    public void reducirExistencia() {
        if (cantidad > 0) {
            cantidad--;
        }
    }
}