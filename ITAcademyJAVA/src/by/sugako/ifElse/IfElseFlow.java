package by.sugako.ifElse;

public class IfElseFlow {

    public static void main(String[] args) {

        int i1 = 12;
        int i2 = 0;

        if (i2 != 0) {
            System.out.println(i1 / i2);
        } else {
            System.out.println("Everything is BAD!!!");
        }

        boolean ey = false;
        int x = 96;
        if(x%16 ==0) {

            ey = true;
        } else {
            ey = false;
        }

        System.out.println(ey);
    }
}
