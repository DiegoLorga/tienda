package com.mycompany.tienda;

public class Inventario {
    private String claveProducto;
    private double subTotal;
    private double total;
    private int unidadesVendidas;
    private double stock;

    // Constructor vacío para composición
    public Inventario() {
        this.claveProducto = "";
        this.subTotal = 0;
        this.total = 0;
        this.unidadesVendidas = 0;
        this.stock = 0;
    }

    public String getClaveProducto() {
        return claveProducto;
    }

    public void setClaveProducto(String claveProducto) {
        this.claveProducto = claveProducto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

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
