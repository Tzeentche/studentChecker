package by.sugako.lesson20.second;

import java.util.function.IntBinaryOperator;

public class SecondUsage {

    public void printResult(IntBinaryOperator secondInterface,
                            int value1, int value2) {
        System.out.println(secondInterface.applyAsInt(value1, value2));
    }

    public static void main(String[] args) {
        final SecondUsage secondUsage = new SecondUsage();
        secondUsage.printResult((a, b) -> a + b, 1, 2);
        secondUsage.printResult((x1, x2) -> x1*x2, 3, 4);
        secondUsage.printResult((val1, val2) -> 500, 4, 5);
        secondUsage.printResult((x, y) -> x/y, 200, 25);

        int result = -1;
        secondUsage.printResult((min, max) -> {
            for (int i = min; i <= max; i++) {
                System.out.print(i + " ");
            }
            return secondUsage.globalResult;
        }, 3, 7);
    }
    private int globalResult = -1;
}
