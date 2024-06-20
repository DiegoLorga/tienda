package packege.funciones.tienda;

import com.mycompany.tienda.Producto;
import com.mycompany.tienda.Inventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiciosProducto {
    private List<Producto> listaProductos;
    private Scanner scanner;

    public ServiciosProducto() {
        this.listaProductos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Método para crear un nuevo producto con su inventario asociado
    public void crearProducto() {
        System.out.println("\nCreación de nuevo producto:");

        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripción del producto: ");
        String descripcion = scanner.nextLine();

        System.out.print("Precio sin IVA: ");
        double precioNoIva = Double.parseDouble(scanner.nextLine());

        System.out.print("Tipo de producto (seco, semicongelado, empaquetado): ");
        String tipo = scanner.nextLine();

        System.out.print("Stock inicial del producto: ");
        double stock = Double.parseDouble(scanner.nextLine());

        Producto nuevoProducto = new Producto(descripcion, precioNoIva, tipo, nombre, stock);
        listaProductos.add(nuevoProducto);

        System.out.println("Producto y registro de inventario creados satisfactoriamente.");
    }
    
       // Método para crear un nuevo producto con su inventario asociado desde la interfaz gráfica
    public void crearProducto(String nombre, String descripcion, double precioNoIva, String tipo, double stock) {
        Producto nuevoProducto = new Producto(descripcion, precioNoIva, tipo, nombre, stock);
        listaProductos.add(nuevoProducto);
    }

    // Método para mostrar todos los productos con sus inventarios
    public void mostrarProductos() {
        System.out.println("\nListado de productos:");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    // Método para actualizar los datos de un producto y su inventario
    public void actualizarProducto() {
        System.out.println("\nActualización de producto:");
        System.out.print("Ingrese la clave del producto a actualizar: ");
        String clave = scanner.nextLine();

        Producto productoEncontrado = buscarProductoPorClave(clave);
        if (productoEncontrado == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.println("Producto encontrado: " + productoEncontrado);
        System.out.println("Ingrese los nuevos datos:");

        System.out.print("Nombre del producto: ");
        productoEncontrado.setNombre(scanner.nextLine());

        System.out.print("Descripción del producto: ");
        productoEncontrado.setDescripcion(scanner.nextLine());

        System.out.print("Precio sin IVA: ");
        productoEncontrado.setPrecioNoIva(Double.parseDouble(scanner.nextLine()));

        System.out.print("Tipo de producto (seco, semicongelado, empaquetado): ");
        productoEncontrado.setTipo(scanner.nextLine());

        // Actualizar inventario también
        Inventario inventario = productoEncontrado.getInventario();
        System.out.print("Stock actualizado del producto: ");
        double stock = Double.parseDouble(scanner.nextLine());
        inventario.setStock(stock);

        System.out.println("Producto y registro de inventario actualizados correctamente.");
    }

    // Método para eliminar un producto y su inventario
    public void eliminarProducto() {
        System.out.println("\nEliminación de producto:");
        System.out.print("Ingrese la clave del producto a eliminar: ");
        String clave = scanner.nextLine();

        Producto productoEncontrado = buscarProductoPorClave(clave);
        if (productoEncontrado == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        listaProductos.remove(productoEncontrado);
        System.out.println("Producto y registro de inventario eliminados correctamente.");
    }

    // Método auxiliar para buscar un producto por clave
    private Producto buscarProductoPorClave(String clave) {
        for (Producto producto : listaProductos) {
            if (producto.getClave().equals(clave)) {
                return producto;
            }
        }
        return null;
    }
}
