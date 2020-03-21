package by.sugako.lesson12.watch;

import java.util.*;

public abstract class AbstractWatch {

    private double price;

    public AbstractWatch(){
        System.out.println("Construct Abstract watch");
    }

    public AbstractWatch(double price) {
        this.price = price;
    }

    public void showTime() {
        System.out.println(new Date());
    }

    void printColor(){
        System.out.println("Print Abstract watchs color");
    }

    void printSize() {
        System.out.println("XXL");
    }

    void printPrice() {
        System.out.println("1000 EUR");
    }
}
