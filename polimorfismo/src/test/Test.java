package test;

import clases.Calculadora;
import clases.Empleado;
import clases.Gerente;

public class Test {
    public static void main(String[] args) {
        Empleado empleado = new Gerente();
        empleado.trabajar();
        empleado.registrarEntrada();
        // empleado.aprobarVacaciones();  //No se puede
        if (empleado instanceof Gerente gerente) {
            gerente.aprobarVacaciones();
        }
        
        // Gerente gerente = (Gerente) empleado;

        // Calculadora calc = new Calculadora();
        // System.out.println(calc.suma(12, 12));
        // System.out.println(calc.suma(34, 12.4));
        // System.out.println(calc.suma(3, 4, 5));

    }
}
