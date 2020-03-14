package by.sugako.lesson14;

import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<Car> set = new TreeSet<>();

        set.add(new Car("BMW", "X5", "1", 123456.45));
        set.add(new Car("Audi", "A6", "3", 312123.32));
        set.add(new Car("VW", "Polo", "2", 10000.00));

        System.out.println(set);
    }
}
