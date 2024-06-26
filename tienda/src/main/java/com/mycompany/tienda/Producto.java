package com.mycompany.tienda;

public class Producto {
    private static int contadorProductos = 0;
    private String clave;
    private String descripcion;
    private double precioNoIva;
    private double precioConIva;
    private String tipo;
    private String nombre;
    private Inventario inventario; // RelaciÃ³n de composiciÃ³n

    public Producto(String descripcion, double precioNoIva, String tipo, String nombre, double stock) {
        this.clave = "P" + contadorProductos++;
        this.descripcion = descripcion;
        this.precioNoIva = precioNoIva;
        this.precioConIva = calcularPrecioConIva(precioNoIva);
        this.tipo = tipo;
        this.nombre = nombre;
        this.inventario = new Inventario(); // CreaciÃ³n del inventario al crear el producto
        this.inventario.setClaveProducto(this.clave);
        this.inventario.setStock(stock);
    }

    private double calcularPrecioConIva(double precioSinIva) {
        return precioSinIva * 1.16; // 16% de IVA
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
