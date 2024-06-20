package com.mycompany.tienda;

public class Producto {
    private static int contadorProductos = 0;
    private String clave;
    private String descripcion;
    private double precioNoIva;
    private double precioConIva;
    private String tipo;
    private String nombre;
    private Inventario inventario; // Relación de composición

    public Producto(String descripcion, double precioNoIva, String tipo, String nombre, double stock) {
        this.clave = "P" + contadorProductos++;
        this.descripcion = descripcion;
        this.precioNoIva = precioNoIva;
        this.precioConIva = calcularPrecioConIva(precioNoIva);
        this.tipo = tipo;
        this.nombre = nombre;
        this.inventario = new Inventario(); // Creación del inventario al crear el producto
        this.inventario.setClaveProducto(this.clave);
        this.inventario.setStock(stock);
    }

    private double calcularPrecioConIva(double precioSinIva) {
        double precioFormateado = formatearADosDecimales(precioSinIva);
        return precioFormateado * 1.16; // 16% de IVA
    }

    private double formatearADosDecimales(double numero) {
        return Math.round(numero * 100.0) / 100.0; // Redondea a dos decimales
    }

    public String getClave() {
        return clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioNoIva() {
        return precioNoIva;
    }

    public void setPrecioNoIva(double precioNoIva) {
        this.precioNoIva = formatearADosDecimales(precioNoIva);
        this.precioConIva = calcularPrecioConIva(precioNoIva);
    }

    public double getPrecioConIva() {
        return precioConIva;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "clave='" + clave + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioNoIva=" + precioNoIva +
                ", precioConIva=" + precioConIva +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", inventario=" + inventario +
                '}';
    }
}
