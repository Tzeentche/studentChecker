package by.sugako.lesson16.serialisible;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarDeserializer {

    public Car deserialize() {
        try(FileInputStream fis = new FileInputStream("car.data");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Car car = new CarDeserializer().deserialize();
        System.out.println(car);
    }

}
