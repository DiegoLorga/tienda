package packege.funciones.tienda;

import com.mycompany.tienda.Pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ServicioPedido {
    private List<Pedido> listaPedidos;
    private Scanner scanner;
    private static int contadorPedidos = 1; // Contador para generar claves autoincrementables

    public ServicioPedido() {
        this.listaPedidos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Método para crear un nuevo pedido con clave autoincrementable
    public void crearPedido() {
        System.out.println("\nCreación de nuevo pedido:");

        // Generar clave autoincrementable
        String clave = "PED-" + contadorPedidos++;

        System.out.print("Fecha de pedido (dd/mm/yyyy): ");
        Date fechaPedido = obtenerFecha();

        System.out.print("IVA del pedido: ");
        double iva = Double.parseDouble(scanner.nextLine());

        System.out.print("Total del pedido: ");
        double total = Double.parseDouble(scanner.nextLine());

        System.out.print("Subtotal del pedido: ");
        double subTotal = Double.parseDouble(scanner.nextLine());

        Pedido nuevoPedido = new Pedido(clave, fechaPedido, iva, total, subTotal);
        listaPedidos.add(nuevoPedido);

        System.out.println("Pedido creado satisfactoriamente.");
    }

    // Método para mostrar todos los pedidos
    public void mostrarPedidos() {
        System.out.println("\nListado de pedidos:");
        for (Pedido pedido : listaPedidos) {
            System.out.println(pedido);
        }
    }

    // Método para actualizar los datos de un pedido
    public void actualizarPedido() {
        System.out.println("\nActualización de pedido:");
        System.out.print("Ingrese la clave del pedido a actualizar: ");
        String clave = scanner.nextLine();

        Pedido pedidoEncontrado = buscarPedidoPorClave(clave);
        if (pedidoEncontrado == null) {
            System.out.println("Pedido no encontrado.");
            return;
        }

        System.out.println("Pedido encontrado: " + pedidoEncontrado);
        System.out.println("Ingrese los nuevos datos:");

        System.out.print("Fecha de pedido (dd/mm/yyyy): ");
        pedidoEncontrado.setFechaPedido(obtenerFecha());

        System.out.print("IVA del pedido: ");
        pedidoEncontrado.setIva(Double.parseDouble(scanner.nextLine()));

        System.out.print("Total del pedido: ");
        pedidoEncontrado.setTotal(Double.parseDouble(scanner.nextLine()));

        System.out.print("Subtotal del pedido: ");
        pedidoEncontrado.setSubTotal(Double.parseDouble(scanner.nextLine()));

        System.out.println("Pedido actualizado correctamente.");
    }

    // Método para eliminar un pedido
    public void eliminarPedido() {
        System.out.println("\nEliminación de pedido:");
        System.out.print("Ingrese la clave del pedido a eliminar: ");
        String clave = scanner.nextLine();

        Pedido pedidoEncontrado = buscarPedidoPorClave(clave);
        if (pedidoEncontrado == null) {
            System.out.println("Pedido no encontrado.");
            return;
        }

        listaPedidos.remove(pedidoEncontrado);
        System.out.println("Pedido eliminado correctamente.");
    }

    // Método auxiliar para buscar un pedido por clave
    private Pedido buscarPedidoPorClave(String clave) {
        for (Pedido pedido : listaPedidos) {
            if (pedido.getClave().equals(clave)) {
                return pedido;
            }
        }
        return null;
    }

    // Método auxiliar para obtener fecha desde la consola
    private Date obtenerFecha() {
        Date fecha = null;
        String fechaStr = scanner.nextLine();
        // Aquí iría la lógica para convertir fechaStr a Date, dependiendo del formato esperado
        return fecha;
    }
}
