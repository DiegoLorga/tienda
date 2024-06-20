/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author Gizelle RM
 */
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private String clave;
    private Date fechaPedido;
    private Date fechaAtencion;
    private double iva;
    private double total;
    private double subTotal;
    private ArrayList<String> claveProducto; // ArrayList de claves de productos en el pedido
    private ArrayList<Double> cantidadXProducto; // ArrayList de cantidades por cada producto en el pedido

    public Pedido(String clave, Date fechaPedido, double iva, double total, double subTotal) {
        this.clave = clave;
        this.fechaPedido = fechaPedido;
        this.iva = iva;
        this.total = total;
        this.subTotal = subTotal;
        this.fechaAtencion = null; // Fecha de atención inicialmente nula
        this.claveProducto = new ArrayList<>();
        this.cantidadXProducto = new ArrayList<>();
    }

    // Getters
    public String getClave() {
        return clave;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public Date getFechaAtencion() {
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

    public ArrayList<String> getClaveProducto() {
        return claveProducto;
    }

    public ArrayList<Double> getCantidadXProducto() {
        return cantidadXProducto;
    }

    // Setters
    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setFechaAtencion(Date fechaAtencion) {
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

    public void setClaveProducto(ArrayList<String> claveProducto) {
        this.claveProducto = claveProducto;
    }

    public void setCantidadXProducto(ArrayList<Double> cantidadXProducto) {
        this.cantidadXProducto = cantidadXProducto;
    }

    // Métodos adicionales
    @Override
    public String toString() {
        return "Pedido{" +
                "clave='" + clave + '\'' +
                ", fechaPedido=" + fechaPedido +
                ", fechaAtencion=" + fechaAtencion +
                ", iva=" + iva +
                ", total=" + total +
                ", subTotal=" + subTotal +
                ", claveProducto=" + claveProducto +
                ", cantidadXProducto=" + cantidadXProducto +
                '}';
    }
}

