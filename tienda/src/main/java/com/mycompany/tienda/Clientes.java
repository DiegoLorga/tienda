package com.mycompany.tienda;

import java.util.Arrays;

public class Clientes {
    private static int ultimoNumeroCliente = 0;
    private static final int MAX_CLIENTES = 50; // Tamaño máximo del array estático
    private static Clientes[] clientesArray = new Clientes[MAX_CLIENTES]; // Array estático de clientes
    private String nombre;
    private int numCliente;
    private String direccionEnvio;
    private String cuentaPago;
    private double ventaMes;
    private String[] pedidosPendientes; // Array de claves de pedidos pendientes
    private String[] pedidosAtendidos; // Array de claves de pedidos atendidos

    public Clientes(String nombre, String direccionEnvio, String cuentaPago, double ventaMes) {
        this.nombre = nombre;
        this.numCliente = ++ultimoNumeroCliente;
        this.direccionEnvio = direccionEnvio;
        this.cuentaPago = cuentaPago;
        this.ventaMes = ventaMes;
        this.pedidosPendientes = new String[MAX_CLIENTES]; // Inicializar el array de pedidos pendientes
        this.pedidosAtendidos = new String[MAX_CLIENTES]; // Inicializar el array de pedidos atendidos
        
        // Agregar el cliente al array estático
        if (ultimoNumeroCliente <= MAX_CLIENTES) {
            clientesArray[ultimoNumeroCliente - 1] = this;
        } else {
            System.out.println("No se pueden agregar más clientes. Límite alcanzado.");
        }
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

    public String[] getPedidosPendientes() {
        return pedidosPendientes;
    }

    public String[] getPedidosAtendidos() {
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

    public void setPedidosPendientes(String[] pedidosPendientes) {
        this.pedidosPendientes = pedidosPendientes;
    }

    public void setPedidosAtendidos(String[] pedidosAtendidos) {
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
                ", pedidosPendientes=" + Arrays.toString(pedidosPendientes) +
                ", pedidosAtendidos=" + Arrays.toString(pedidosAtendidos) +
                '}';
    }
}
