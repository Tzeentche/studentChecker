package by.sugako.Ternarity;

public class Ternar {

    public static void main(String[] args) {

        System.out.println(divideOnThree(10));
        System.out.println(divideOnThree(9));
    }

    static String divideOnThree(int number) {

        return number % 3 == 0 ? "yes" : "no";
    }
}
