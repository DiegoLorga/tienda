package com.mycompany.tienda;

public class Clientes {
    private String nombre;
    private int numCliente;
    private static int num = 0;
    private int cuentaPago;
    private int pedidosPendientes;
    private int pedidosAtendidos;
    private String direccionEnvio;
    private int ventaTotalMes;

    // Constructor por defecto
    public Clientes() {
        this.nombre = "sin nombre";
        this.numCliente = incrementaNumCliente();
        this.pedidosPendientes = 0;
        this.pedidosAtendidos = 0;
        this.direccionEnvio = "133#";
        this.cuentaPago = 0;
        this.ventaTotalMes = 0;
        
    }

    // Constructor con parámetros
    public Clientes(String nombre, int cuentaPago, int pedidosPendientes, int pedidosAtendidos, String direccionEnvio, int ventaTotalMes ) {
        this.nombre = nombre;
        this.numCliente = incrementaNumCliente();
        this.cuentaPago = cuentaPago;
        this.pedidosPendientes = pedidosPendientes;
        this.pedidosAtendidos = pedidosAtendidos;
        this.direccionEnvio = direccionEnvio;
        this.ventaTotalMes = ventaTotalMes;
    }

    // Método para incrementar y obtener el número de cliente
    private int incrementaNumCliente() {
        return ++num;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuentaPago(int cuentaPago) {
        this.cuentaPago = cuentaPago;
    }

    public void setPedidosPendientes(int pedidosPendientes) {
        this.pedidosPendientes = pedidosPendientes;
    }

    public void setPedidosAtendidos(int pedidosAtendidos) {
        this.pedidosAtendidos = pedidosAtendidos;
    }
    
    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }
    
    public void setVentaTotalMes(int ventaTotalMes) {
        this.ventaTotalMes = ventaTotalMes;
    }
    

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public int getCuentaPago() {
        return cuentaPago;
    }

    public int getPedidosPendientes() {
        return pedidosPendientes;
    }

    public int getPedidosAtendidos() {
        return pedidosAtendidos;
    }
    
    public String getDireccionEnvio() {
        return direccionEnvio;
    }
    
    public int getVentaTotalMes() {
        return ventaTotalMes;
    }
}
