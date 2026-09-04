import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MaquinaExpendedora maquina =
                new MaquinaExpendedora();

        // Productos iniciales
        Bebida cocaCola =
                new Bebida(
                        "Coca-Cola",
                        8.00,
                        10,
                        0.05
                );

        Bebida agua =
                new Bebida(
                        "Agua pura",
                        5.00,
                        10,
                        0.02
                );

        Snack papas =
                new Snack(
                        "Papas fritas",
                        7.00,
                        8,
                        0.03
                );

        Snack galletas =
                new Snack(
                        "Galletas",
                        6.00,
                        8,
                        0.02
                );

        maquina.agregarProducto(cocaCola);
        maquina.agregarProducto(agua);
        maquina.agregarProducto(papas);
        maquina.agregarProducto(galletas);

        Administrador administrador =
                new Administrador("Administrador");

        int opcion;

        do {

            System.out.println("\n==============================");
            System.out.println("   MÁQUINA EXPENDEDORA");
            System.out.println("==============================");

            System.out.println("1. Ver productos");
            System.out.println("2. Comprar producto");
            System.out.println("3. Recargar producto");
            System.out.println("4. Ver resumen");
            System.out.println("5. Ver administrador");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    maquina.getInventario().mostrarProductos();

                    break;

                case 2:

                    maquina.getInventario().mostrarProductos();

                    System.out.print(
                            "\nSeleccione el producto: "
                    );

                    int producto =
                            scanner.nextInt();

                    System.out.print(
                            "Ingrese dinero: Q"
                    );

                    double dinero =
                            scanner.nextDouble();

                    maquina.comprar(
                            producto - 1,
                            dinero
                    );

                    break;

                case 3:

                    maquina.getInventario().mostrarProductos();

                    System.out.print(
                            "\nSeleccione el producto: "
                    );

                    int productoRecarga =
                            scanner.nextInt();

                    Producto productoEncontrado =
                            maquina.getInventario()
                                    .buscarProducto(
                                            productoRecarga - 1
                                    );

                    if (productoEncontrado != null) {

                        System.out.print(
                                "Cantidad a agregar: "
                        );

                        int cantidad =
                                scanner.nextInt();

                        administrador.recargarProducto(
                                productoEncontrado,
                                cantidad
                        );

                    } else {

                        System.out.println(
                                "Producto no válido."
                        );
                    }

                    break;

                case 4:

                    maquina.mostrarResumen();

                    break;

                case 5:

                    administrador.mostrarNombre();

                    break;

                case 6:

                    System.out.println(
                            "Programa finalizado."
                    );

                    break;

                default:

                    System.out.println(
                            "Opción no válida."
                    );
            }

        } while (opcion != 6);

        scanner.close();
    }
}