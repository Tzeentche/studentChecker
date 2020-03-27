package by.sugako.lesson16.serialisible;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarSerializable {

    public void serialize(Car car) {

        try(FileOutputStream fos = new FileOutputStream("car.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(car);
            oos.flush();
            fos.flush();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Car car = new Car();
                car.setMaker("Volvo");
                car.setModel("XC60");
                car.setYear((short)2020);
                car.setPrice(20_000.99);
        System.out.println(car);

        new CarSerializer().serialize(car);
    }
}
