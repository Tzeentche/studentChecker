package by.sugako.lesson18.bankomat;

import by.sugako.lesson18.client.NoSuchAmountException;

public interface Bankomat {

    Integer get(int TargetAutomat) throws NoSuchAmountException;

    void add(Integer amount);
    void printBalance();
    void close();
    boolean isOpen();
}
