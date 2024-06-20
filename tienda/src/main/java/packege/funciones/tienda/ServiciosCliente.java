/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packege.funciones.tienda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import com.mycompany.tienda.Clientes;

public class ServiciosCliente {
    private List<Clientes> listaClientes;
    private Scanner scanner;


    public ServiciosCliente() {
        this.listaClientes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Método para crear un nuevo cliente
    public void crearCliente() {
        System.out.println("\nCreación de nuevo cliente:");
        
        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Dirección de envío: ");
        String direccionEnvio = scanner.nextLine();

        System.out.print("Cuenta de pago: ");
        String cuentaPago = scanner.nextLine();

        System.out.print("Venta del mes: ");
        double ventaMes = Double.parseDouble(scanner.nextLine());

        Clientes nuevoCliente = new Clientes(nombre, direccionEnvio, cuentaPago, ventaMes);
        listaClientes.add(nuevoCliente);

        System.out.println("Cliente creado satisfactoriamente.");
    }

    // Método para mostrar todos los clientes
    public void mostrarClientes() {
        System.out.println("\nListado de clientes:");
        for (Clientes cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    // Método para actualizar los datos de un cliente
    public void actualizarCliente() {
        System.out.println("\nActualización de cliente:");
        System.out.print("Ingrese el número de cliente a actualizar: ");
        int numCliente = Integer.parseInt(scanner.nextLine());

        Clientes clienteEncontrado = buscarClientePorNumero(numCliente);
        if (clienteEncontrado == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.println("Cliente encontrado: " + clienteEncontrado);
        System.out.println("Ingrese los nuevos datos:");

        System.out.print("Nombre del cliente: ");
        clienteEncontrado.setNombre(scanner.nextLine());

        System.out.print("Dirección de envío: ");
        clienteEncontrado.setDireccionEnvio(scanner.nextLine());

        System.out.print("Cuenta de pago: ");
        clienteEncontrado.setCuentaPago(scanner.nextLine());

        System.out.print("Venta del mes: ");
        clienteEncontrado.setVentaMes(Double.parseDouble(scanner.nextLine()));

        System.out.println("Cliente actualizado correctamente.");
    }

    // Método para eliminar un cliente
    public void eliminarCliente() {
        System.out.println("\nEliminación de cliente:");
        System.out.print("Ingrese el número de cliente a eliminar: ");
        int numCliente = Integer.parseInt(scanner.nextLine());

        Clientes clienteEncontrado = buscarClientePorNumero(numCliente);
        if (clienteEncontrado == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        listaClientes.remove(clienteEncontrado);
        System.out.println("Cliente eliminado correctamente.");
    }

    // Método auxiliar para buscar un cliente por número de cliente
    private Clientes buscarClientePorNumero(int numCliente) {
        for (Clientes cliente : listaClientes) {
            if (cliente.getNumCliente() == numCliente) {
                return cliente;
            }
        }
        return null;
    }
}

