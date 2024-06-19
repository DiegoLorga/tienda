package com.mycompany.tienda;

public class Secos extends Producto {
    // Constructor con parámetros
    public Secos(String nombre, String descripcion, double precioNoIva, int inventario) {
        super(nombre, descripcion, precioNoIva, inventario, "SECOS", "gramos");
    }
    
    // Constructor vacío
    public Secos() {
        super();
    }
    
    // Método para vender unidades en gramos
    public void vender(double gramos) {
        setUnidadesVendidas((int) gramos); // Asumiendo que las unidades vendidas se manejan en enteros
        setSubTotal(); // Corregido el nombre del método a setSubTotal
    }
    
    // Método para reiniciar las unidades vendidas y el subtotal
    public void reset() {
        setUnidadesVendidas(0);
        setSubTotal(); // Corregido el nombre del método a setSubTotal
    }
}
