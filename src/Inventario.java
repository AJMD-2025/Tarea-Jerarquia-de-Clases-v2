import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarInventario() {
        System.out.println("\n===== INVENTARIO =====");

        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }
    }

    public int calcularExistenciasTotales() {
        int total = 0;

        for (Producto producto : productos) {
            total += producto.getCantidad();
        }

        return total;
    }

    public double calcularValorInventario() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.calcularPrecioFinal() * producto.getCantidad();
        }

        return total;
    }
}