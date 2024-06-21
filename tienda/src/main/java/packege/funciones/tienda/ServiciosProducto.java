package packege.funciones.tienda;

import com.mycompany.tienda.Producto;
import com.mycompany.tienda.Inventario;

import java.util.Scanner;

public class ServiciosProducto {
    private Producto[] listaProductos;
    private int cantidadProductos;
    private Scanner scanner;

    public ServiciosProducto() {
        this.listaProductos = new Producto[100];
        this.cantidadProductos = 0;
        this.scanner = new Scanner(System.in);
    }


    
    // MÃ©todo para crear un nuevo producto con su inventario asociado desde la interfaz grÃ¡fica
    public void crearProducto(String nombre, String descripcion, double precioNoIva, String tipo, double stock) {
        if (cantidadProductos >= 100) {
            System.out.println("No se pueden agregar mÃ¡s productos. El array estÃ¡ lleno.");
            return;
        }
        
        Producto nuevoProducto = new Producto(descripcion, precioNoIva, tipo, nombre, stock);
        listaProductos[cantidadProductos++] = nuevoProducto;
    }

    // MÃ©todo para mostrar todos los productos con sus inventarios
    public void mostrarProductos() {
        System.out.println("\nListado de productos:");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println(listaProductos[i]);
        }
    }

 // MÃ©todo para actualizar los datos de un producto y su inventario
    public void actualizarProducto(String clave, String nombre, String descripcion, double precioNoIva, String tipo, double stock) {
        Producto productoEncontrado = buscarProductoPorClave(clave);
        if (productoEncontrado == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.println("Producto encontrado: " + productoEncontrado);
        System.out.println("Actualizando datos del producto...");

        productoEncontrado.setNombre(nombre);
        productoEncontrado.setDescripcion(descripcion);
        productoEncontrado.setPrecioNoIva(precioNoIva);
        productoEncontrado.setTipo(tipo);

        // Actualizar inventario tambiÃ©n
        Inventario inventario = productoEncontrado.getInventario();
        inventario.setStock(stock);

        System.out.println("Producto y registro de inventario actualizados correctamente.");
    }

    // MÃ©todo para eliminar un producto y su inventario


    // MÃ©todo auxiliar para buscar un producto por clave
    private Producto buscarProductoPorClave(String clave) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (listaProductos[i].getClave().equals(clave)) {
                return listaProductos[i];
            }
        }
        return null;
    }
    
    public void eliminarProducto(String clave) {
        System.out.println("\nEliminaciÃ³n de producto:");

        int indiceProducto = buscarIndiceProductoPorClave(clave);
        if (indiceProducto == -1) {
            System.out.println("Producto no encontrado.");
            return;
        }

        // Desplazar los elementos hacia la izquierda para llenar el espacio vacÃ­o
        for (int i = indiceProducto; i < cantidadProductos - 1; i++) {
            listaProductos[i] = listaProductos[i + 1];
        }

        listaProductos[--cantidadProductos] = null;
        System.out.println("Producto y registro de inventario eliminados correctamente.");
    }

    // MÃ©todo auxiliar para buscar el Ã­ndice de un producto por clave
    private int buscarIndiceProductoPorClave(String clave) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (listaProductos[i].getClave().equals(clave)) {
                return i;
            }
        }
        return -1;
    }
    
    
    public Producto[] getListaProductos() {
        return listaProductos;
    }
    
    public void crearDiezProductos() {
        crearProducto("yogurt", "Caducidad: 12/12/2030  Temperatura: -25 grados", 30, "Semicongelado", 40);
        crearProducto("leche", "Caducidad: 22/12/2028  Temperatura: -1 grados", 25, "Semicongelado", 20);
        crearProducto("almendras", "", 55, "Seco", 30);
        crearProducto("frijol", "Empaque: Enlatado", 41, "Empaquetado", 60);
        crearProducto("jugo", "Empaque: Enlatado", 15.50, "Empaquetado", 50);
        crearProducto("queso", "Caducidad: 01/01/2024  Temperatura: 5 grados", 60.99, "Semicongelado", 600);
        crearProducto("quesillo", "Caducidad: 15/07/2024  Temperatura: 5 grados", 70.99, "Semicongelado", 700);
        crearProducto("galleta", "", 16, "Seco", 45);
        crearProducto("crema", "Caducidad: 15/07/2024  Temperatura: 3 grados", 47, "Tipo9", 28);
        crearProducto("pasta", "", 10.50, "Tipo10", 100);
        
        mostrarProductos();
    }
    
}
