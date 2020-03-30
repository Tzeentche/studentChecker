package by.sugako.lesson17.bankomat;

import by.sugako.lesson17.client.NoSuchAmountException;

public interface Bankomat {

    Integer get(int TargetAutomat) throws NoSuchAmountException;

    void add(Integer amount);
    void printBalance();
    void close();
    boolean isOpen();
}
