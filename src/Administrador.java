public class Administrador {

    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public void recargarProducto(Producto producto, int cantidad) {

        producto.aumentarCantidad(cantidad);

        System.out.println(
                "Se agregaron " + cantidad +
                        " unidades de " +
                        producto.getNombre()
        );
    }

    public void mostrarNombre() {
        System.out.println("Administrador: " + nombre);
    }

    public int calcularRecargaTotal(int cantidad1, int cantidad2) {
        return cantidad1 + cantidad2;
    }
}