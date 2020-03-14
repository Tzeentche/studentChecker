package by.sugako.lesson14;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "X5", "1", 123456.45));
        System.out.println(list + " " + list.size());

        list.add(null);

        list.add(2, new Car("Audi", "A6", "3", 312123.32));
        System.out.println(list);

        list.set(1, new Car("VW", "Polo", "2", 10000.00));
        System.out.println(list);

        Car car4 = list.get(2);
        System.out.println(car4);
    }

}

class Car implements Comparable<Car> {
    private String carModel;
    private String carBrand;
    private String VinNr;
    private double price;

    public Car(String carModel, String carBrand, String vinNr, double price) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        VinNr = vinNr;
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getVinNr() {
        return VinNr;
    }

    public void setVinNr(String vinNr) {
        VinNr = vinNr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", VinNr='" + VinNr + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        if(this.price > car.price) {
            return 1;
        } else if(this.price < car.price) {
            return -1;
        }
        return 0;
    }
}