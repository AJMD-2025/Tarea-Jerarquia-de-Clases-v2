public class Dulce extends Producto {

    private double descuento;

    public Dulce(String codigo, String nombre, double precio, int cantidad, double descuento) {
        super(codigo, nombre, precio, cantidad);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() - (getPrecio() * descuento);
    }

    public double calcularDescuento() {
        return getPrecio() * descuento;
    }

    public double calcularPrecioPorCantidad(int cantidad) {
        return calcularPrecioFinal() * cantidad;
    }
}
