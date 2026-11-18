package sistemaempleados.modelo;

public class Sueldo {
    private double cantidad; 

    public Sueldo(double cantidadInicial) {
        if (cantidadInicial >= 0) {
            this.cantidad = cantidadInicial;
        } else {
            this.cantidad = 0.0;
        }
    }

    public double getCantidad() {
        return cantidad;
    }
  
    public void aplicarIncremento(double montoExtra) {
        if (montoExtra > 0) {
            this.cantidad += montoExtra;
        }
    }
}
