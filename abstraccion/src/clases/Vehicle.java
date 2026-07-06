package clases;

public abstract class Vehicle {
    protected String model;
    
    // protected Vehicle(String model) {
    //     this.model = model;
    // }

    //metodo abstracto
    public abstract void startEngine();

    //Metodo concreto
    public void stop(){
        System.out.println("Vehicle stopped.");
    }
}
