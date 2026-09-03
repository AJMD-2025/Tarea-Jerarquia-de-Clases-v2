public abstract class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract double calcularPrecioFinal();

    public boolean hayExistencia() {
        return cantidad > 0;
    }

    public void reducirCantidad() {
        if (cantidad > 0) {
            cantidad--;
        }
    }

    public void aumentarCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void mostrarInformacion() {
        System.out.println(
                codigo + " | " +
                        nombre + " | Q" +
                        String.format("%.2f", calcularPrecioFinal()) +
                        " | Existencia: " + cantidad
        );
    }
}