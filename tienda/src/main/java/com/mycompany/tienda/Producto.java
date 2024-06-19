package com.mycompany.tienda;

public class Producto { 
    // clase producto la cual sera la clase padre de los demas productos
    private static int i = 0; // variable de clase con la que asigno la clave
    
    // informacion basica del producto
    private String nombre;
    private int clave;
    private double unidadesVendidas;
    private String descripcion;
    private String tipo;
    private double precioNoIva;
    private double precioConIva;
    private double subTotal; //ventas generales del producto SIN iva
    private int inventario; 
    
    // constructor
    public Producto(String nombre, String descripcion, double precioNoIva, double precioConIva, String tipo, int clave, double unidadesVendidas, int inventario,  String medida) {
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precioNoIva);
        setTipo(tipo);
        setInventario(inventario);
        this.clave = incrementaClave(); //esta
        this.unidadesVendidas = 0;
        setSubTotal();
    }
    
    // constructor vacio
    public Producto() {
        this.nombre = "sin nombre";
        this.descripcion = "Sin descripcion";
        this.precioNoIva = 0.0;
        this.precioConIva = 0.0;
        this.tipo = "sin tipo";
        this.inventario = 0;
        this.clave = 0;
        this.unidadesVendidas = 0.0;
        this.subTotal = 0.0;
    }
    
    private int incrementaClave() {
        return ++i;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public void setSubTotal() {
        this.subTotal = this.precioNoIva * this.unidadesVendidas;
    }
    
    public void setInventario(int inventario) {
        if (inventario >= 0 ) {
           this.inventario = inventario;
        } else {
            throw new IllegalArgumentException("Numero no válido, el inventario debe de ser mayor a cero");
        }
    }
    
    public void setNombre(String nombre) {
        if (nombre != null ) {
           this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Cadena vacía no aceptada");
        }
    }
    
    
    public void setDescripcion(String descripcion) {
        if (descripcion != null ) {
            this.descripcion = descripcion;
        } else {
            throw new IllegalArgumentException("Descripción vacía inválida");
        }
    }
    
    public void setPrecio(double precioNoIva) {
        if (precioNoIva <= 0) {
            this.precioNoIva = 0;
            this.precioConIva = 0;
        } else {
            this.precioNoIva = precioNoIva;
            this.precioConIva = precioNoIva * 1.16;
        }
    }
    
    // Metodos getters
    
    public String getTipo() {
        return tipo;
    }
    
    public double getSubTotal() {
        return subTotal;
    }
    
    public int getInventario() {
        return inventario;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getClave() {
        return clave;
    }
    
    public double getUnidadesVendidas() {
        return unidadesVendidas;
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
}
