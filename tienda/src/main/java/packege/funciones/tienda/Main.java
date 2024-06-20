//Para probar crud de clientes 

/*
package packege.funciones.tienda;


import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.tienda.Clientes;

public class Main {
    private static ServiciosCliente serviciosCliente = new ServiciosCliente();
    private static ServiciosProducto serviciosProducto = new ServiciosProducto();
    private static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    serviciosCliente.crearCliente();
                    break;
                case 2:
                    serviciosCliente.mostrarClientes();
                    break;
                case 3:
                    serviciosCliente.actualizarCliente();
                    break;
                case 4:
                    serviciosCliente.eliminarCliente();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Crear cliente");
        System.out.println("2. Mostrar clientes");
        System.out.println("3. Actualizar cliente");
        System.out.println("4. Eliminar cliente");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
} */


//para probmar crud de productos e inventario 

/* 
package packege.funciones.tienda;


import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.tienda.Clientes;


import java.util.Scanner;

public class Main {
    private static ServiciosProducto serviciosProducto = new ServiciosProducto();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    serviciosProducto.crearProducto();
                    break;
                case 2:
                    serviciosProducto.mostrarProductos();
                    break;
                case 3:
                    serviciosProducto.actualizarProducto();
                    break;
                case 4:
                    serviciosProducto.eliminarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Crear producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
}

*/

//para probar el crud de pedido 

package packege.funciones.tienda;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static ServiciosCliente serviciosCliente = new ServiciosCliente();
    private static ServiciosProducto serviciosProducto = new ServiciosProducto();
    private static ServicioPedido serviciosPedido = new ServicioPedido();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    serviciosCliente.crearCliente();
                    break;
                case 2:
                    serviciosCliente.mostrarClientes();
                    break;
                case 3:
                    serviciosCliente.actualizarCliente();
                    break;
                case 4:
                    serviciosCliente.eliminarCliente();
                    break;
                case 5:
                    serviciosProducto.crearProducto();
                    break;
                case 6:
                    serviciosProducto.mostrarProductos();
                    break;
                case 7:
                    serviciosProducto.actualizarProducto();
                    break;
                case 8:
                    serviciosProducto.eliminarProducto();
                    break;
                case 9:
                    serviciosPedido.crearPedido();
                    break;
                case 10:
                    serviciosPedido.mostrarPedidos();
                    break;
                case 11:
                    serviciosPedido.actualizarPedido();
                    break;
                case 12:
                    serviciosPedido.eliminarPedido();
                    break;
                case 13:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 13);
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Crear cliente");
        System.out.println("2. Mostrar clientes");
        System.out.println("3. Actualizar cliente");
        System.out.println("4. Eliminar cliente");
        System.out.println("5. Crear producto");
        System.out.println("6. Mostrar productos");
        System.out.println("7. Actualizar producto");
        System.out.println("8. Eliminar producto");
        System.out.println("9. Crear pedido");
        System.out.println("10. Mostrar pedidos");
        System.out.println("11. Actualizar pedido");
        System.out.println("12. Eliminar pedido");
        System.out.println("13. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
