package com.mycompany.tienda;

public class Fecha {
    private short dia;
    private short mes;
    private short anio;

    // Constructor por defecto
    public Fecha() {
        this.dia = 11;
        this.mes = 11;
        this.anio = 2005;
    }

    // Constructor con parámetros
    public Fecha(short dia, short mes, short anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    // Métodos getters
    public short getDia() {
        return dia;
    }

    public short getMes() {
        return mes;
    }

    public short getAnio() {
        return anio;
    }

    // Métodos setters con validaciones básicas
    public void setDia(short dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 1; 
        }
    }

    public void setMes(short mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1; 
        }
    }

    public void setAnio(short anio) {
        if (anio > 0) {
            this.anio = anio;
        } else {
            this.anio = 2000; 
        }
    }
}
