
package com.mycompany.tienda;

public class Empaquetados extends TipoProducto {
    private String tipoEmpaquetado;
    private double descuento;

    public Empaquetados(String tipo, String tipoEmpaquetado) {
        super(tipo, "pieza", 0); // Asignación de valores por defecto
        this.tipoEmpaquetado = tipoEmpaquetado;
        this.descuento = 0.02;
    }

    public String getTipoEmpaquetado() {
        return tipoEmpaquetado;
    }

    public void setTipoEmpaquetado(String tipoEmpaquetado) {
        this.tipoEmpaquetado = tipoEmpaquetado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Empaquetados{" +
                "tipo='" + getTipo() + '\'' +
                ", medida='" + getMedida() + '\'' +
                ", precioEmpaque=" + getPrecioEmpaque() +
                ", tipoEmpaquetado='" + tipoEmpaquetado + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
