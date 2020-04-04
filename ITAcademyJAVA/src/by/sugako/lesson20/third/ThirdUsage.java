package by.sugako.lesson20.third;

public class ThirdUsage {

    static <T extends Integer> void sum(T i1, T i2, T i3) {
        System.out.println(i1.intValue() + i2.intValue() + i3.intValue());
    }

    <T extends Integer> void multiply(T i1, T i2, T i3) {
        System.out.println(i1.intValue() * i2.intValue() * i3.intValue());
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
