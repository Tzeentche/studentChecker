package by.sugako.watch;

import java.util.*;

public class QuartzWatch extends AbstractWatch {

    @Override
    public void showTime() {
        System.out.println("Show time quartz watch " + new Date());
    }

    @Override
    void printColor() {
        System.out.println("Quartz watch color green");
    }
}
