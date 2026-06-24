package clases;

import padre.Person;

public class Teacher extends Person{
    //Is-a   --> relacionar la herencia
    // private String name;
    // private int age;

    //Composición  --> Tiene un
    private double salary;

    public Teacher(){
        // System.out.println("Teacher");
    }
    
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
        
    public String showInformation(){
        return "{Name: %s, Age: %d, Salary: $%.2f}".formatted(name, age, salary);
    }

    @Override
    public String toString() {
        return "{name: " + name + ", age: " + age + ", salary: " + salary + "}";
    }

    


}
