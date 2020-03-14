package by.sugako.watch;

import java.util.*;

public class MechanicalWatcch extends AbstractWatch implements Showable {

    public MechanicalWatcch(double price) {
        System.out.println("Construct mechanical watch price = " + price);
    }

    @Override
    public void printColor() {
        System.out.println("Blach mechanical watch");
    }

    public void printSize() {
        System.out.println("M");
    }

    public void showTime(String format) {
        System.out.println(format);
        super.showTime();
    }

    @Override
    public void showTime() {
        System.out.println("Mechanical watch show time " + new Date());
    }
}
