package test;

import clases.Bird;
// import clases.Automovil;
import clases.Circle;
import clases.Rectangle;
import clases.Shape;
// import clases.Vehicle;
import interfaces.Flyable;

public class Test {
    public static void main(String[] args) {
        // Vehicle vehicle = new Automovil();
        // vehicle.startEngine();
        // vehicle.stop();
        Circle circle = new Circle(5);
        circle.area();
        circle.show();

        Shape rectangle = new Rectangle(4, 6);
        rectangle.area();
        rectangle.show();

        Bird bird = new Bird();
        bird.fly();
    }
}
