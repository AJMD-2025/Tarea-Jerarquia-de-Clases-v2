public class MaquinaExpendedora {

    private Inventario inventario;
    private double ventasTotales;
    private int cantidadVentas;

    public MaquinaExpendedora() {
        inventario = new Inventario();
        ventasTotales = 0;
        cantidadVentas = 0;
    }

    public void agregarProducto(Producto producto) {
        inventario.agregarProducto(producto);
    }

    public void comprar(int numeroProducto, double dinero) {

        Producto producto = inventario.buscarProducto(numeroProducto);

        if (producto == null) {
            System.out.println("Producto no válido.");
            return;
        }

        Pago pago = new Pago(
                producto.calcularPrecio(),
                dinero
        );

        Venta venta = new Venta(producto, pago);

        if (venta.realizarVenta()) {

            ventasTotales += venta.obtenerTotal();
            cantidadVentas++;

            System.out.println("\nCompra realizada.");
            System.out.println(
                    "Producto: " + producto.getNombre()
            );

            System.out.println(
                    "Total: Q" +
                            String.format("%.2f", venta.obtenerTotal())
            );

            System.out.println(
                    "Cambio: Q" +
                            String.format("%.2f", venta.obtenerCambio())
            );
        }
    }

    public void mostrarResumen() {

        System.out.println("\n===== RESUMEN =====");

        System.out.println(
                "Ventas realizadas: " +
                        cantidadVentas
        );

        System.out.println(
                "Dinero obtenido: Q" +
                        String.format("%.2f", ventasTotales)
        );

        System.out.println(
                "Productos en inventario: " +
                        inventario.totalProductos()
        );
    }

    public Inventario getInventario() {
        return inventario;
    }
}