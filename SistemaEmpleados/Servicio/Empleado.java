package sistemaempleados.servicio;

import sistemaempleados.modelo.Sueldo;

public class Empleado {
    private String nombre;
    private Sueldo sueldo; 

    public Empleado(String nombre, double sueldoInicial) {
        this.nombre = nombre;
        this.sueldo = new Sueldo(sueldoInicial);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoActual() {
        return sueldo.getCantidad();
    }

    public void autorizarAumento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 20.0) {
            double aumento = sueldo.getCantidad() * (porcentaje / 100.0);
            sueldo.aplicarIncremento(aumento);
            System.out.println("Aumento del " + porcentaje + "% aplicado correctamente a " + nombre);
        } else {
            System.out.println("Politica rechazada: El incremento del " + porcentaje + "% excede el limite autorizado (max. 20%) o es invalido.");
        }
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " - Sueldo actual: $" + sueldo.getCantidad();
    }
}
