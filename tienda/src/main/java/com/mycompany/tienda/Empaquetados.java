package com.mycompany.tienda;

public class Empaquetados extends Producto {

    private String empaque;//enlatado o tetrapack

    public Empaquetados(String nombre, String descripcion, double precioNoIva, int inventario, String empaque){
         super(nombre, descripcion, precioNoIva, inventario, "Empaquetados", "pieza");//pieza despues de 10 son caja
         this.empaque = empaque;
    }

    public Empaquetados(){
        super();
        empaque = "";
    }

        public void setEmpaque( String empaque){
            this.empaque = empaque;
        }
        public String getEmpaque(){
            return empaque;
        }

        public int ventaxcajas(int unidad){



        return (unidad);
        }


        public void vender(double pieza) {
        setUnidadesVendidas((int) pieza); // Asumiendo que las unidades vendidas se manejan en enteros
        setSubTotal(); // Corregido el nombre del método a setSubTotal
    }

    // Método para reiniciar las unidades vendidas y el subtotal
    public void reset() {
        setUnidadesVendidas(0);
        setSubTotal(); // Corregido el nombre del método a setSubTotal
    }

}
