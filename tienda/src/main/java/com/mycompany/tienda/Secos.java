
package com.mycompany.tienda;

//APLICACION DE POLIMORFISMO Y 
public class Secos extends TipoProducto {
    private int caducidad;

    public Secos(String tipo, int caducidad) {
        super(tipo, "kilos", 0); // Asignación de valores por defecto
        this.caducidad = caducidad;
    }

    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "Secos{" +
                "tipo='" + getTipo() + '\'' +
                ", medida='" + getMedida() + '\'' +
                ", precioEmpaque=" + getPrecioEmpaque() +
                ", caducidad=" + caducidad +
                '}';
    }
}
