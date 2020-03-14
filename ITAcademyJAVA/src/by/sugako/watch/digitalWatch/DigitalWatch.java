package by.sugako.watch.digitalWatch;

import by.sugako.watch.AbstractWatch;
import java.util.*;

public class DigitalWatch extends AbstractWatch {

    @Override
    public void showTime() {
        System.out.println("Digital watch " + new Date());
    }

    public void printSize() {
        System.out.println("Digital watch S size");
    }

    public void printColor() {
        System.out.println("Digital watch color is yellow.");
    }

}
