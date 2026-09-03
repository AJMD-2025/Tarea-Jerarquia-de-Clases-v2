public class Bebida extends Producto {

    private double impuesto;

    public Bebida(String codigo, String nombre, double precio, int cantidad, double impuesto) {
        super(codigo, nombre, precio, cantidad);
        this.impuesto = impuesto;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() + (getPrecio() * impuesto);
    }

    public double calcularImpuesto() {
        return getPrecio() * impuesto;
    }

    public double calcularPrecioPorCantidad(int cantidad) {
        return calcularPrecioFinal() * cantidad;
    }
}