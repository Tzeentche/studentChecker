package by.sugako.lesson20.third;

public class ThirdUsage {

    static void sum(Integer i1, Integer i2, Integer i3) {
        System.out.println(i1 + i2 + i3);
    }

    void multiply(Integer i1, Integer i2, Integer i3) {
        System.out.println(i1 * i2 * i3);
    }

    public void execute(ThirdInterface thirdInterface, int a, int b, int c) {
        thirdInterface.doSomething(a, b, c);
    }

    public static void main(String[] args) {
        ThirdUsage thirdUsage = new ThirdUsage();
        thirdUsage.execute(ThirdUsage::sum, 2, 3, 4);
        thirdUsage.execute(thirdUsage::multiply, 2, 3, 4);
    }
}
