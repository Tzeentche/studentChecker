package by.sugako.WhereIsLogivc;

public class LogicalOperations {

    public static void main(String[] args) {

        int i1 = 0;
        int i2 = 5;
        System.out.println((i1 > 0) && (i2 / i1 > 0));
//        System.out.println((i1 > 0) & (i2 / i1 > 0));

       byte x = 127;


        System.out.println(-x == (byte)(x + 2));

        System.out.println("Third");
//        System.out.println(returnTrue() || returnFalse());
        System.out.println("Fourth");
//        System.out.println(returnTrue() | returnFalse());

    }

    public boolean returnTrue() {

        return true;
    }

    public boolean returnFalse() {

        return false;
    }
}
