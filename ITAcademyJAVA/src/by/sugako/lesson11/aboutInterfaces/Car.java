package by.sugako.lesson11.aboutInterfaces;

public class Car extends Vehicle implements Movable {

    public void move() {
        System.out.println("Car is moving.");
    }

    public void drive() {
        System.out.println("Driving Car.");
    }
}
