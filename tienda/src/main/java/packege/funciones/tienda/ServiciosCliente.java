package packege.funciones.tienda;

import com.mycompany.tienda.Clientes;

public class ServiciosCliente {
    private Clientes[] listaClientes; // Cambiado a array de Clientes
    private int numClientes; // Variable para llevar el conteo de clientes
    private static final int MAX_CLIENTES = 50; // Tamaño máximo del array

    public ServiciosCliente() {
        this.listaClientes = new Clientes[MAX_CLIENTES];
        this.numClientes = 0; // Inicialmente no hay clientes
    }

    // Método para crear un nuevo cliente
    public void crearCliente(String nombres, String direccion, String cuenta) {
        System.out.println("\nCreación de nuevo cliente:");

        System.out.print("Nombre del cliente: ");
        String nombre = nombres;

        System.out.print("Dirección de envío: ");
        String direccionEnvio = direccion;

        System.out.print("Cuenta de pago: ");
        String cuentaPago = cuenta;

        System.out.print("Venta del mes: ");
        double ventaMes = 0;

        Clientes nuevoCliente = new Clientes(nombre, direccionEnvio, cuentaPago, ventaMes);
        
        // Verificar si hay espacio disponible en el array
        if (numClientes < MAX_CLIENTES) {
            listaClientes[numClientes] = nuevoCliente;
            numClientes++; // Incrementar el contador de clientes
            System.out.println("Cliente creado satisfactoriamente.");
        } else {
            System.out.println("No se pueden agregar más clientes. Límite alcanzado.");
        }
    }

    // Método para mostrar un cliente dado su índice en el array
    public Clientes mostrarCliente(int indice) {
        if (indice >= 0 && indice < numClientes) {
            return listaClientes[indice];
        } else {
            System.out.println("Índice fuera de rango.");
            return null;
        }
    }

    // Método para actualizar los datos de un cliente
  public void actualizarCliente(Clientes cliente, String nombre, String direccion, String cuenta) {
    if (cliente != null) {
        cliente.setNombre(nombre);
        cliente.setDireccionEnvio(direccion);
        cliente.setCuentaPago(cuenta);
        System.out.println("Cliente actualizado correctamente.");
    } else {
        System.out.println("Cliente no encontrado. No se pudo actualizar.");
    }
}


  public void eliminarCliente(int numCliente) {
    int indice = -1;
    for (int i = 0; i < numClientes; i++) {
        if (listaClientes[i].getNumCliente() == numCliente) {
            indice = i;
            break;
        }
    }

    if (indice != -1) {
        for (int i = indice; i < numClientes - 1; i++) {
            listaClientes[i] = listaClientes[i + 1];
        }
        listaClientes[numClientes - 1] = null; // Eliminar la última referencia
        numClientes--; // Decrementar el contador de clientes
        System.out.println("Cliente eliminado correctamente.");
    } else {
        System.out.println("Cliente no encontrado. No se pudo eliminar el cliente.");
    }
}


    // Método auxiliar para buscar un cliente por número de cliente
    public Clientes buscarClientePorNumero(int numCliente) {
        for (int i = 0; i < numClientes; i++) {
            if (listaClientes[i].getNumCliente() == numCliente) {
                return listaClientes[i];
            }
        }
        System.out.println("Cliente no encontrado.");
        return null;
    }

    public Clientes[] getListaClientes() {
        return listaClientes;
    }
}
