
package com.mycompany.tienda;

public class Producto {
    private static int contadorProductos = 1; // Variable estática para generar claves autoincrementables
    private String clave;
    private String descripcion;
    private double precioNoIva;
    private double precioConIva;
    private String tipo;
    private String nombre;

    public Producto(String descripcion, double precioNoIva, String tipo, String nombre) {
        this.clave = "P" + contadorProductos++; // Generación automática de la clave autoincrementable
        this.descripcion = descripcion;
        this.precioNoIva = precioNoIva;
        this.precioConIva = calcularPrecioConIva(precioNoIva);
        this.tipo = tipo;
        this.nombre = nombre;
    }

    // Método para calcular precio con IVA
    private double calcularPrecioConIva(double precioSinIva) {
        return precioSinIva * 1.16; // 16% de IVA
    }

    // Getters
    public String getClave() {
        return clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioNoIva() {
        return precioNoIva;
    }

    public double getPrecioConIva() {
        return precioConIva;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    // Setters
    // No hay setter para la clave, ya que es autoincrementable y no se modifica manualmente

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioNoIva(double precioNoIva) {
        this.precioNoIva = precioNoIva;
        this.precioConIva = calcularPrecioConIva(precioNoIva);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos adicionales
    @Override
    public String toString() {
        return "Producto{" +
                "clave='" + clave + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioNoIva=" + precioNoIva +
                ", precioConIva=" + precioConIva +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
