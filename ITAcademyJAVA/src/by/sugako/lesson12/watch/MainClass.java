package by.sugako.lesson12.watch;

import by.sugako.lesson12.watch.digitalWatch.DigitalWatch;

public class MainClass {

    public static void main(String[] args) {
        AbstractWatch watch = new MechanicalWatcch(155.99);
        watch.showTime();
        watch.printColor();
        watch.printSize();

        AbstractWatch watch1 = new QuartzWatch();
        watch1.showTime();

        AbstractWatch watch2 = new DigitalWatch();
        watch2.showTime();
        watch2.printColor();
        watch2.printSize();

        AbstractWatch watch3 = new NewQuartzWatch((MechanicalWatcch)watch);
        watch3.printColor();
        watch3.showTime();
    }
}
