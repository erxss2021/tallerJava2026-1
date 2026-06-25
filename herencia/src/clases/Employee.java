package clases;

import padre.Person;

public class Employee extends Person{
    private double salary;

    public double calculateBonus(){
        return salary + 100;
    }
}
