public abstract class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract double calcularPrecio();

    public void vender() {
        if (cantidad > 0) {
            cantidad--;
        }
    }

    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}