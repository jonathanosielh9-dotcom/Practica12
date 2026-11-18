package ejercicio1;

public class Sueldo {
    private double cantidad=0;

    public Sueldo(double cantidad) {
        setCantidad(cantidad);
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: No se permiten valores negativos. La cantidad se estableció en 0.0");
        }
    }

    @Override
    public String toString() {
        return "$" + cantidad;
    }
}
