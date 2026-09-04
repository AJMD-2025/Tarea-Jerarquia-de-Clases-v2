public class Snack extends Producto {

    private double recargo;

    public Snack(String nombre, double precio, int cantidad, double recargo) {
        super(nombre, precio, cantidad);
        this.recargo = recargo;
    }

    @Override
    public double calcularPrecio() {
        return getPrecio() + (getPrecio() * recargo);
    }

    public double calcularRecargo() {
        return getPrecio() * recargo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo: Snack");
    }
}