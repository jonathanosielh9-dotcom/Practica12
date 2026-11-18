package sistemaempleados.app;
import sistemaempleados.servicio.Empleado;

public class Main {

    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos Mendoza", 12000.0);
        System.out.println(emp);
        System.out.println("\n");

        System.out.println("Intento de aumento 1 (10%):");
        emp.autorizarAumento(10.0);
        System.out.println(emp);
        System.out.println("\n");

        System.out.println("Intento de aumento 2 (25% - Fuera de regla):");
        emp.autorizarAumento(25.0);
        System.out.println(emp);
        System.out.println("\n");

        System.out.println("Intento de aumento 3 (-5% - Invalido):");
        emp.autorizarAumento(-5.0);
        System.out.println(emp);
    }
}
