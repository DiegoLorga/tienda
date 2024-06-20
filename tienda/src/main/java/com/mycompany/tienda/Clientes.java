package com.mycompany.tienda;

import java.util.ArrayList;

public class Clientes {
      private static int ultimoNumeroCliente = 0;
    private String nombre;
    private int numCliente;
    private String direccionEnvio;
    private String cuentaPago;
    private double ventaMes;
    private ArrayList<String> pedidosPendientes; // ArrayList de claves de pedidos pendientes
    private ArrayList<String> pedidosAtendidos; // ArrayList de claves de pedidos atendidos

    public Clientes(String nombre,String direccionEnvio, String cuentaPago, double ventaMes) {
        this.nombre = nombre;
        this.numCliente = ++ultimoNumeroCliente;;
        this.direccionEnvio = direccionEnvio;
        this.cuentaPago = cuentaPago;
        this.ventaMes = ventaMes;
        this.pedidosPendientes = new ArrayList<>();
        this.pedidosAtendidos = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public String getCuentaPago() {
        return cuentaPago;
    }

    public double getVentaMes() {
        return ventaMes;
    }

    public ArrayList<String> getPedidosPendientes() {
        return pedidosPendientes;
    }

    public ArrayList<String> getPedidosAtendidos() {
        return pedidosAtendidos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public void setCuentaPago(String cuentaPago) {
        this.cuentaPago = cuentaPago;
    }

    public void setVentaMes(double ventaMes) {
        this.ventaMes = ventaMes;
    }

    public void setPedidosPendientes(ArrayList<String> pedidosPendientes) {
        this.pedidosPendientes = pedidosPendientes;
    }

    public void setPedidosAtendidos(ArrayList<String> pedidosAtendidos) {
        this.pedidosAtendidos = pedidosAtendidos;
    }

    // Métodos adicionales
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", numCliente=" + numCliente +
                ", direccionEnvio='" + direccionEnvio + '\'' +
                ", cuentaPago='" + cuentaPago + '\'' +
                ", ventaMes=" + ventaMes +
                ", pedidosPendientes=" + pedidosPendientes +
                ", pedidosAtendidos=" + pedidosAtendidos +
                '}';
    }
}
