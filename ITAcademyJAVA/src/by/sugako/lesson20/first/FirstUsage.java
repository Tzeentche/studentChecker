package by.sugako.lesson20.first;

import java.util.function.DoubleSupplier;

public class FirstUsage {

    public void printDouble(DoubleSupplier firstInterface) {
        System.out.println(firstInterface.getAsDouble());
    }


}
