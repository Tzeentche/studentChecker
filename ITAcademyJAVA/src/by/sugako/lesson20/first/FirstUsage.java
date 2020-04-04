package by.sugako.lesson20.first;

import java.util.function.DoubleSupplier;

public class FirstUsage {

    public void printDouble(DoubleSupplier firstInterface) {
        System.out.println(firstInterface.getAsDouble());
    }

    public static void main(String[] args) {
        new FirstUsage().printDouble(() -> 123.45);

        DoubleSupplier firstInterface1 = new FirstInterfaceImpl();
        new FirstUsage().printDouble(firstInterface1);
    }

}

class FirstInterfaceImpl implements DoubleSupplier {

    @Override
    public double getAsDouble() {
        return 123.45;
    }
}