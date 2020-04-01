package by.sugako.lesson19;

public class Main {

    public static void main(String[] args) {
        try {
            Car car1 = CarFactory.buildCar(CarType.LUXURY);
            System.out.println(car1.getModel());
            System.out.println(car1 instanceof LuxuryCar);

            Car car2 = CarFactory.buildCar(CarType.SEDAN);
            Car car3 = CarFactory.buildCar(CarType.SMALL);

            Car car4 = CarFactory.buildCar(null);
            System.exit(1);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
