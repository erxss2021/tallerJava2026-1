package test;

import variables.Contador;
import variables.Persona;


public class Principal {
    public static void main(String[] args) {
        Persona persona = new Persona(); 

        persona.mostrar();

        System.out.println("-----------------------------");

        Persona persona2;
        persona2 = new Persona();
        persona2.nombre = "Eloy";
        persona2.edad = 40;
        persona2.mostrar();

        System.out.println("-----------Variables estaticas-----------");

        new Contador();
        new Contador();
        new Contador();

        System.out.println("Total de objetos: " + Contador.total);
    }
}
