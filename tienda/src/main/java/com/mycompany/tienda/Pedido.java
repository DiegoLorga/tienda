package com.mycompany.tienda;

import java.util.Arrays;

public class Pedido {
    private String clave;
    private String fechaPedido;
    private String fechaAtencion;
    private int numCliente;
    private double iva;
    private double total;
    private double subTotal;
    private String[] claveProducto; // Array de claves de productos en el pedido
    private double[] cantidadXProducto; // Array de cantidades por cada producto en el pedido
    private String status; // Nuevo atributo status con valor por defecto

    public Pedido(String clave, String fechaPedido, int numCliente) {
        this.clave = clave;
        this.fechaPedido = fechaPedido;
        this.fechaAtencion = null; // Fecha de atenciÃ³n inicialmente nula
        this.claveProducto = new String[5]; // TamaÃ±o inicial del array, puedes cambiarlo segÃºn tus necesidades
        this.cantidadXProducto = new double[5]; // TamaÃ±o inicial del array, puedes cambiarlo segÃºn tus necesidades
        this.status = "pendiente"; // Valor por defecto para status
        this.numCliente = numCliente;
    }

    // Getters
    public String getClave() {
        return clave;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public String[] getClaveProducto() {
        return claveProducto;
    }

    public double[] getCantidadXProducto() {
        return cantidadXProducto;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setClaveProducto(String[] claveProducto) {
        this.claveProducto = claveProducto;
    }

    public void setCantidadXProducto(double[] cantidadXProducto) {
        this.cantidadXProducto = cantidadXProducto;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    // MÃ©todos adicionales
    @Override
    public String toString() {
        return "Pedido{" +
                "clave='" + clave + '\'' +
                ", fechaPedido=" + fechaPedido +
                ", fechaAtencion=" + fechaAtencion +
                ", iva=" + iva +
                ", total=" + total +
                ", subTotal=" + subTotal +
                ", claveProducto=" + Arrays.toString(claveProducto) +
                ", cantidadXProducto=" + Arrays.toString(cantidadXProducto) +
                ", status='" + status + '\'' +
                ", numCliente=" + numCliente +
                '}';
    }
}
