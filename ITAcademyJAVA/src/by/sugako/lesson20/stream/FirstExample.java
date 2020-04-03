package by.sugako.lesson20.stream;

import java.util.ArrayList;
import java.util.List;

public class FirstExample {

    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3", "4");

        list.stream()
                .filter(s -> !"".equals(s))
                .forEach(System.out::println);

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add(null);
        strings.add("b");
        strings.add("123");
        strings.add(null);
        strings.add("c");

        strings.stream()
                .filter(s -> s != null)
                .filter(s -> s.matches("[A-Za-z]"))
                .forEach(System.out::println);
    }

    static void average(List<Integer> number) {

//        average - ?

    }
}
