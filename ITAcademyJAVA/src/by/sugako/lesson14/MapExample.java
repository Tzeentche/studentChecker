package by.sugako.lesson14;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Car> map = new HashMap<>();

        map.put("1", new Car("BMW", "X5", "1", 123456.45));
        map.put("3", new Car("Audi", "A6", "3", 312123.32));
        map.put("2", new Car("VW", "Polo", "2", 10000.00));
        map.put("4", new Car("Audi", "A6", "3", 316623.32));
        System.out.println(map);

        map.remove("2");
        System.out.println(map);

        List<String> strings = List.of("1", "2", "3");
        System.out.println(strings);
    }
}
