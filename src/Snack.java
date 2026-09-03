public class Snack extends Producto {

    private double recargo;

    public Snack(String codigo, String nombre, double precio, int cantidad, double recargo) {
        super(codigo, nombre, precio, cantidad);
        this.recargo = recargo;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() + (getPrecio() * recargo);
    }

    public double calcularRecargo() {
        return getPrecio() * recargo;
    }

    public double calcularPrecioPorCantidad(int cantidad) {
        return calcularPrecioFinal() * cantidad;
    }
}
