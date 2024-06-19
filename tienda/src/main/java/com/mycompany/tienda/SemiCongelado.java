package com.mycompany.tienda;

public class SemiCongelado extends Producto {

    private float temperaturaRecomendada;
    private Fecha caducidad;

    public SemiCongelado(String nombre, String descripcion, double precioNoIva, int inventario, float temperaturaRecomendada, short dia, short mes, short anio) {
        super(nombre, descripcion, precioNoIva, inventario, "SemiCongelados", "litros");
        setTemperaturaRecomendada(temperaturaRecomendada);
        setCaducidad(dia, mes, anio);
    }

    public SemiCongelado() {
        super();
        temperaturaRecomendada = 17.2f;
        caducidad = new Fecha();
    }

    public void setTemperaturaRecomendada(float temperaturaRecomendada) {
        if (temperaturaRecomendada <= 0.0) {
            this.temperaturaRecomendada = 0.0f;
        } else {
            this.temperaturaRecomendada = temperaturaRecomendada;
        }
    }

    public Fecha getCaducidad() {
        return caducidad;
    }

    public float getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setCaducidad(short dia, short mes, short anio) {
        caducidad = new Fecha(dia, mes, anio);
    }

    public void vender(double litros) {
        setUnidadesVendidas((int) litros); // Asumiendo que las unidades vendidas se manejan en enteros
        setSubTotal(); 
    }

    public void reset() {
        setUnidadesVendidas(0);
        setSubTotal(); 
    }

}

