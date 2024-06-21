
package com.mycompany.tienda;

public class Semicongelados extends TipoProducto {
    private int temperatura;

    public Semicongelados(String tipo, int temperatura) {
        super(tipo, "litros", 12.5); // Asignación de valores por defecto
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Semicongelados{" +
                "tipo='" + getTipo() + '\'' +
                ", medida='" + getMedida() + '\'' +
                ", precioEmpaque=" + getPrecioEmpaque() +
                ", temperatura=" + temperatura +
                '}';
    }
}
