import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(int numero) {
        if (numero >= 0 && numero < productos.size()) {
            return productos.get(numero);
        }

        return null;
    }

    public void mostrarProductos() {

        System.out.println("\n===== PRODUCTOS =====");

        for (int i = 0; i < productos.size(); i++) {

            Producto producto = productos.get(i);

            System.out.println(
                    (i + 1) + ". " +
                            producto.getNombre() +
                            " - Q" +
                            String.format("%.2f", producto.calcularPrecio()) +
                            " - Stock: " +
                            producto.getCantidad()
            );
        }
    }

    public int totalProductos() {

        int total = 0;

        for (Producto producto : productos) {
            total += producto.getCantidad();
        }

        return total;
    }
}