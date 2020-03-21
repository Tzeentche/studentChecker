package by.sugako.lesson11.aboutInterfaces;

public class Uber extends Vehicle implements Movable, Payable {

    public void move() {
        System.out.println("Uber is moving.");
    }

    public void pay() {
        System.out.println("Pay 7.00 BYN.");
    }

    public void move(int i) {
        System.out.println("Uber is moving " + i + " km.");
    }

    public void drive() {
        System.out.println("Driving Uber.");
        getLicensePlateNumber();
        super.getLicensePlateNumber();
    }

    public String getLicensePlateNumber() {

        return super.getLicensePlateNumber() + "UBER";
    }
}
