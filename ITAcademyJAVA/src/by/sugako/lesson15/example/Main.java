package by.sugako.lesson15.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Divider divider = new Divider();
        double r1 = callDivider(divider, 6, 3);
        double r2 = callDivider(divider, 3, 0);
        callDivider(null, 3, 0);

        System.out.println(r1);
        log.info("result1=" + r1);
        System.out.println(r2);
        log.info("result2=" + r2);
    }

    public static double callDivider(Divider divider, int a, int b) {
        // No code
        try {
            return divider.divide(a, b);
        } catch (Exception e) {
            log.log(Level.SEVERE, "callDivider has an error", e);
            return -1;
        }
        // No code
    }
}
