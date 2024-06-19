package com.mycompany.tienda;

public class Producto { 
    // clase producto la cual sera la clase padre de los demas productos
    private static int i = 0; // variable de clase con la que asigno la clave
    
    // informacion basica del producto
    private String nombre;
    private int clave;
    private int unidadesVendidas;
    private String descripcion;
    private double precioNoIva;
    private double precioConIva;
    private double subTotal;
    private int inventario;
    private String tipo;
    private String medida;
    
    // constructor
    public Producto(String nombre, String descripcion, double precioNoIva, int inventario, String tipo, String medida) {
        setNombre(nombre);
        this.clave = ++i;
        this.unidadesVendidas = 0;
        setDescripcion(descripcion);
        setPrecioNoIva(precioNoIva);
        setInventario(inventario);
        this.subTotal = precioNoIva * unidadesVendidas;
        setTipo(tipo);
        setMedida(medida);
    }
    
    // constructor vacio
    public Producto() {
        this.nombre = "sin nombre";
        this.clave = ++i;
        this.unidadesVendidas = 0;
        this.descripcion = "Sin descripcion";
        this.precioNoIva = 0.0;
        this.precioConIva = 0.0;
        this.inventario = 0;
        this.subTotal = 0.0;
        this.tipo = "sin tipo";
        this.medida = "picogramos";
    }
    
    // Metodos setters
    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setSubTotal() {
        this.subTotal = this.precioNoIva * this.unidadesVendidas;
    }
    
    public void setInventario(int inventario) {
        this.inventario = Math.max(inventario, 0);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setUnidadesVendidas(int unidadesVendidas) {
        if (unidadesVendidas > 0) {
            this.unidadesVendidas += unidadesVendidas;
            setSubTotal();
        }
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setPrecioNoIva(double precioNoIva) {
        if (precioNoIva <= 0) {
            this.precioNoIva = 0;
            this.precioConIva = 0;
        } else {
            this.precioNoIva = precioNoIva;
            this.precioConIva = precioNoIva * 1.16;
        }
    }
    
    // Metodos getters
    public String getMedida() {
        return medida;
    }
    
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
    
    public int getUnidadesVendidas() {
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
