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

    // Constantes para valores por defecto
    private static final String DEFAULT_NOMBRE = "sin nombre";
    private static final String DEFAULT_DIRECCION_ENVIO = "133#";

    // Constructor por defecto
    public Clientes() {
        this(DEFAULT_NOMBRE, 0, 0, 0, DEFAULT_DIRECCION_ENVIO, 0);
    }

    // Constructor con parámetros
    public Clientes(String nombre, int cuentaPago, int pedidosPendientes, int pedidosAtendidos, String direccionEnvio, int ventaTotalMes) {
        this.nombre = nombre;
        this.numCliente = incrementaNumCliente();
        this.cuentaPago = cuentaPago;
        this.pedidosPendientes = pedidosPendientes;
        this.pedidosAtendidos = pedidosAtendidos;
        this.direccionEnvio = direccionEnvio;
        this.ventaTotalMes = ventaTotalMes;
    }

    // Método para incrementar y obtener el número de cliente
    private synchronized int incrementaNumCliente() {
        return ++num;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }

    public void setCuentaPago(int cuentaPago) {
        if (cuentaPago >= 0) {
            this.cuentaPago = cuentaPago;
        } else {
            throw new IllegalArgumentException("La cuenta de pago no puede ser negativa");
        }
    }

    public void setPedidosPendientes(int pedidosPendientes) {
        if (pedidosPendientes >= 0) {
            this.pedidosPendientes = pedidosPendientes;
        } else {
            throw new IllegalArgumentException("Los pedidos pendientes no pueden ser negativos");
        }
    }

    public void setPedidosAtendidos(int pedidosAtendidos) {
        if (pedidosAtendidos >= 0) {
            this.pedidosAtendidos = pedidosAtendidos;
        } else {
            throw new IllegalArgumentException("Los pedidos atendidos no pueden ser negativos");
        }
    }

    public void setDireccionEnvio(String direccionEnvio) {
        if (direccionEnvio != null && !direccionEnvio.trim().isEmpty()) {
            this.direccionEnvio = direccionEnvio;
        } else {
            throw new IllegalArgumentException("La dirección de envío no puede estar vacía");
        }
    }

    public void setVentaTotalMes(int ventaTotalMes) {
        if (ventaTotalMes >= 0) {
            this.ventaTotalMes = ventaTotalMes;
        } else {
            throw new IllegalArgumentException("La venta total del mes no puede ser negativa");
        }
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

    // Método toString
    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", numCliente=" + numCliente +
                ", cuentaPago=" + cuentaPago +
                ", pedidosPendientes=" + pedidosPendientes +
                ", pedidosAtendidos=" + pedidosAtendidos +
                ", direccionEnvio='" + direccionEnvio + '\'' +
                ", ventaTotalMes=" + ventaTotalMes +
                '}';
    }

    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clientes clientes = (Clientes) o;

        if (numCliente != clientes.numCliente) return false;
        if (!nombre.equals(clientes.nombre)) return false;
        return direccionEnvio.equals(clientes.direccionEnvio);
    }

    // Método hashCode
    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + direccionEnvio.hashCode();
        result = 31 * result + numCliente;
        return result;
    }
}
