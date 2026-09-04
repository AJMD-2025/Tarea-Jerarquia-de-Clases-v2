public class Venta {

    private Producto producto;
    private Pago pago;

    public Venta(Producto producto, Pago pago) {
        this.producto = producto;
        this.pago = pago;
    }

    public boolean realizarVenta() {

        if (producto.getCantidad() <= 0) {
            System.out.println("Producto agotado.");
            return false;
        }

        if (!pago.verificarPago()) {
            System.out.println(
                    "Dinero insuficiente. Falta Q" +
                            String.format("%.2f", pago.calcularFaltante())
            );

            return false;
        }

        producto.vender();

        return true;
    }

    public double obtenerCambio() {
        return pago.calcularCambio();
    }

    public double obtenerTotal() {
        return producto.calcularPrecio();
    }
}
