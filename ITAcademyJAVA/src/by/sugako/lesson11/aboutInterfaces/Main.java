package by.sugako.lesson11.aboutInterfaces;

public class Main {

    public static void main(String[] args) {
//        Movable movable = new Movable();
        Movable movable1 = new Car();
        Movable movable2 = new Bus();

        Passenger passenger = new Passenger(movable1);
        passenger.driveToHome();

        passenger.setMovable(movable2);
        passenger.driveToHome();
        passenger.payForUsage((Bus)movable2);
        ((Bus)movable2).pay();

        System.out.println(movable2);

        Uber uber = new Uber();
        passenger.setMovable(uber);
        passenger.driveToHome();
        passenger.payForUsage(uber);
    }
}
