/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author Gizelle RM
 */
public class Inventario {
    private String claveProducto;
    private double subTotal;
    private double total;
    private int unidadesVendidas;
    private double stock;

    public Inventario(String claveProducto, double subTotal, double total, int unidadesVendidas, double stock) {
        this.claveProducto = claveProducto;
        this.subTotal = subTotal;
        this.total = total;
        this.unidadesVendidas = unidadesVendidas;
        this.stock = stock;
    }

    // Getters
    public String getClaveProducto() {
        return claveProducto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getTotal() {
        return total;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public double getStock() {
        return stock;
    }

    // Setters
    public void setClaveProducto(String claveProducto) {
        this.claveProducto = claveProducto;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Inventario{" +
                "claveProducto='" + claveProducto + '\'' +
                ", subTotal=" + subTotal +
                ", total=" + total +
                ", unidadesVendidas=" + unidadesVendidas +
                ", stock=" + stock +
                '}';
    }
}
