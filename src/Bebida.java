public class Bebida extends Producto {

    private double impuesto;

    public Bebida(String nombre, double precio, int cantidad, double impuesto) {
        super(nombre, precio, cantidad);
        this.impuesto = impuesto;
    }

    @Override
    public double calcularPrecio() {
        return getPrecio() + (getPrecio() * impuesto);
    }

    public double calcularImpuesto() {
        return getPrecio() * impuesto;
    }

    public void mostrarTipo() {
        System.out.println("Tipo: Bebida");
    }
}