package by.sugako.lesson20;

import by.sugako.lesson20.third.ThirdInterface;

public class FunctionalProgrammingExample {

    FunctionalProgrammingExample sum(Integer i1, Integer i2, Integer i3) {
        System.out.println(i1 + i2 + i3);
        return this;
    }

    FunctionalProgrammingExample multiply(Integer i1, Integer i2, Integer i3) {
        System.out.println(i1 * i2 * i3);
        return this;
    }

    public FunctionalProgrammingExample execute(ThirdInterface thirdInterface, int a, int b, int c) {
        thirdInterface.doSomething(a, b, c);
        return this;
    }

    public static void main(String[] args) {
        new FunctionalProgrammingExample()
                .multiply(2, 3, 4)
                .sum(2, 3, 4)
                .execute(
                        (a, b, c) -> System.out.println(a + " " + b + " " + c),
                        1, 4, 5);
    }
}
