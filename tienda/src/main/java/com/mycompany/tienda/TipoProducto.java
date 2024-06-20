/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author Gizelle RM
 */
public class TipoProducto {
    private String tipo;
    private String medida;
    private double precioEmpaque;
    private String descripcion;

    public TipoProducto(String tipo, String medida, double precioEmpaque, String descripcion) {
        this.tipo = tipo;
        this.medida = medida;
        this.precioEmpaque = precioEmpaque;
        this.descripcion = descripcion;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getMedida() {
        return medida;
    }

    public double getPrecioEmpaque() {
        return precioEmpaque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public void setPrecioEmpaque(double precioEmpaque) {
        this.precioEmpaque = precioEmpaque;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método toString()
    @Override
    public String toString() {
        return "TipoProducto{" +
                "tipo='" + tipo + '\'' +
                ", medida='" + medida + '\'' +
                ", precioEmpaque=" + precioEmpaque +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

