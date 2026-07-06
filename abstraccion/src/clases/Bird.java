package clases;

import java.util.List;

import interfaces.Flyable;

public class Bird implements Flyable{

    @Override
    public void fly() {
        System.err.println("Flying");
    }

   

}
