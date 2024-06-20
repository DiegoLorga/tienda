package packege.funciones.tienda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gizelle RM
 */
import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.tienda.Clientes;

public class Main {
    private static ServiciosCliente serviciosCliente = new ServiciosCliente();
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
}