
package com.mycompany.tienda;


public class TipoProducto {
    private String tipo;
    private String medida;
    private double precioEmpaque;

    public TipoProducto(String tipo, String medida, double precioEmpaque) {
        this.tipo = tipo;
        this.medida = medida;
        this.precioEmpaque = precioEmpaque;
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


    // Método toString()
    @Override
    public String toString() {
        return "TipoProducto{" +
                "tipo='" + tipo + '\'' +
                ", medida='" + medida + '\'' +
                ", precioEmpaque=" + precioEmpaque +
                '}';
    }
}

