package packege.funciones.tienda;

import com.mycompany.tienda.Pedido;

import java.util.Scanner;

public class ServicioPedido {

    private Pedido[] listaPedidos;
    private int contadorPedidos;
    private Scanner scanner;

    public ServicioPedido() {
        this.listaPedidos = new Pedido[10]; // TamaÃ±o inicial del array, puedes ajustarlo segÃºn tus necesidades
        this.contadorPedidos = 0;
        this.scanner = new Scanner(System.in);
    }

    // MÃ©todo para crear un nuevo pedido con clave autoincrementable
    public void crearPedido() {
        System.out.println("\nCreaciÃ³n de nuevo pedido:");

        // Generar clave autoincrementable
        String clave = "PED-" + contadorPedidos++;

        System.out.print("Fecha de pedido (dd/mm/yyyy): ");
        String fechaPedido = obtenerFecha();

        System.out.print("Numero de cliente: ");
        int numCliente = Integer.parseInt(scanner.nextLine()); // Leer el nÃºmero de cliente desde la consola

        String[] clavesProductos = new String[5]; // TamaÃ±o inicial del array, puedes ajustarlo segÃºn tus necesidades
        int indiceProducto = 0;
        boolean seguirAgregando = true;
        while (seguirAgregando && indiceProducto < clavesProductos.length) {
            System.out.print("Clave del producto (o 'fin' para terminar): ");
            String claveProducto = scanner.nextLine();
            if (claveProducto.equalsIgnoreCase("fin")) {
                seguirAgregando = false;
            } else {
                clavesProductos[indiceProducto++] = claveProducto;
            }
        }

        Pedido nuevoPedido = new Pedido(clave, fechaPedido, numCliente);
        nuevoPedido.setClaveProducto(clavesProductos); // Agregar las claves al pedido
        listaPedidos[contadorPedidos - 1] = nuevoPedido;

        System.out.println("Pedido creado satisfactoriamente.");
    }

    // MÃ©todo para mostrar todos los pedidos
    public void mostrarPedidos() {
        System.out.println("\nListado de pedidos:");
        for (Pedido pedido : listaPedidos) {
            if (pedido != null) {
                System.out.println(pedido);
            }
        }
    }

    // MÃ©todo para actualizar los datos de un pedido
    public void actualizarPedido() {
        System.out.println("\nActualizaciÃ³n de pedido:");
        System.out.print("Ingrese la clave del pedido a actualizar: ");
        String clave = scanner.nextLine();

        // Buscar el pedido por su clave
        Pedido pedidoEncontrado = buscarPedidoPorClave(clave);
        if (pedidoEncontrado == null) {
            System.out.println("Pedido no encontrado.");
            return;
        }

        System.out.println("Pedido encontrado: " + pedidoEncontrado);
        System.out.println("Ingrese los nuevos datos:");

        // Actualizar la fecha de pedido
        System.out.print("Fecha de pedido (dd/mm/yyyy): ");
        String fechaPedido = obtenerFecha();
        pedidoEncontrado.setFechaPedido(fechaPedido);

        // Actualizar el nÃºmero de cliente
        System.out.print("Nuevo nÃºmero de cliente: ");
        int nuevoNumCliente = Integer.parseInt(scanner.nextLine());
        pedidoEncontrado.setNumCliente(nuevoNumCliente);

        // Actualizar las claves de productos
        String[] nuevasClavesProductos = new String[5]; // TamaÃ±o inicial del array, puedes ajustarlo segÃºn tus necesidades
        int indiceProducto = 0;
        boolean seguirAgregando = true;
        while (seguirAgregando && indiceProducto < nuevasClavesProductos.length) {
            System.out.print("Clave del producto (o 'fin' para terminar): ");
            String nuevaClaveProducto = scanner.nextLine();
            if (nuevaClaveProducto.equalsIgnoreCase("fin")) {
                seguirAgregando = false;
            } else {
                nuevasClavesProductos[indiceProducto++] = nuevaClaveProducto;
            }
        }
        pedidoEncontrado.setClaveProducto(nuevasClavesProductos);

        System.out.println("Pedido actualizado correctamente.");
    }

    // MÃ©todo para eliminar un pedido
    public void eliminarPedido() {
        System.out.println("\nEliminaciÃ³n de pedido:");
        System.out.print("Ingrese la clave del pedido a eliminar: ");
        String clave = scanner.nextLine();

        Pedido pedidoEncontrado = buscarPedidoPorClave(clave);
        if (pedidoEncontrado == null) {
            System.out.println("Pedido no encontrado.");
            return;
        }

        // Eliminar el pedido del array
        for (int i = 0; i < listaPedidos.length; i++) {
            if (listaPedidos[i] != null && listaPedidos[i].getClave().equals(clave)) {
                listaPedidos[i] = null;
                System.out.println("Pedido eliminado correctamente.");
                return;
            }
        }

        System.out.println("Pedido no encontrado.");
    }

    // MÃ©todo auxiliar para buscar un pedido por clave
    private Pedido buscarPedidoPorClave(String clave) {
        for (Pedido pedido : listaPedidos) {
            if (pedido != null && pedido.getClave().equals(clave)) {
                return pedido;
            }
        }
        return null;
    }

    private String obtenerFecha() {
        return scanner.nextLine();
    }
}
