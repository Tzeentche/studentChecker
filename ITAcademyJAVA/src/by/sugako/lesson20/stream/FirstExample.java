package by.sugako.lesson20.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(null);
//        average(list1);
        average2(null);
        average2(list1);
    }

    public static void average(List<Integer> numbers) {

        if (numbers == null) return;
        int sum = 0;
        int count = 0;

        for(Integer i:numbers) {
            if(i != null) {
                sum += i;
                count++;
            }
        }

        if(count != 0) {
            System.out.println((double) sum / count);
        }
    }

    public static void average2(List<Integer> numbers) {

        if(numbers == null) return;
        System.out.println(numbers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(-1)
        );
    }
}
