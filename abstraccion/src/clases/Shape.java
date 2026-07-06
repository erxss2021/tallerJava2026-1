package clases;

public abstract class Shape{
    public abstract double area();

    public void show(){
        System.out.println("Area: " + area());
    }
}
