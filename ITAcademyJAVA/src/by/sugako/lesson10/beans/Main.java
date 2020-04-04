package by.sugako.lesson10.beans;

public class Main {

    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.setYear(2019);
        System.out.println(car1.getYear());

        Car2 car2 = new Car2();
        car2.setYear(2018);
        System.out.println(car2.getYear());
    }
}
