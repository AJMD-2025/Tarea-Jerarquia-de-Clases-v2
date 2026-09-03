public class Cliente {

    private String nombre;
    private int comprasRealizadas;
    private double dineroGastado;

    public Cliente(String nombre) {
        this.nombre = nombre;
        comprasRealizadas = 0;
        dineroGastado = 0;
    }

    public void registrarCompra(double total) {
        comprasRealizadas++;
        dineroGastado += total;
    }

    public double calcularDescuento() {
        if (comprasRealizadas >= 10) {
            return dineroGastado * 0.10;
        }

        if (comprasRealizadas >= 5) {
            return dineroGastado * 0.05;
        }

        return 0;
    }

    public double calcularTotalConDescuento() {
        return dineroGastado - calcularDescuento();
    }

    public String getNombre() {
        return nombre;
    }

    public int getComprasRealizadas() {
        return comprasRealizadas;
    }

    public double getDineroGastado() {
        return dineroGastado;
    }
}