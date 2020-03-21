package by.sugako.lesson11.aboutInterfaces;

public class Bus extends Vehicle implements Movable, Payable {

    public void move() {
        System.out.println("Bus is moving.");
    }

    public void pay() {
        System.out.println("Pay 0.70 BYN.");
    }

    void drive() {
        System.out.println("Driving bus.");
    }
}
