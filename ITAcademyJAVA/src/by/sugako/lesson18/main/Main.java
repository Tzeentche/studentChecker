package by.sugako.lesson18.main;

import by.sugako.lesson18.bankomat.Bankomat;
import by.sugako.lesson18.bankomat.BankomatImpl;
import by.sugako.lesson18.casheer.Cashier;
import by.sugako.lesson18.casheer.CashierImpl;
import by.sugako.lesson18.client.ClientImpl;

public class Main {

    public static void main(String[] args) {

        Bankomat bankomat = new BankomatImpl();

        Cashier cashier = new CashierImpl(bankomat);
        new Thread((Runnable) cashier).start();

        startNewClient(bankomat,1);
        startNewClient(bankomat,2);
        startNewClient(bankomat,3);
        startNewClient(bankomat,4);
        startNewClient(bankomat,5);

        try {
            Thread.currentThread().sleep(10_000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            bankomat.close();
        }

    }

    static void startNewClient(Bankomat bankomat, int clientId) {
        ClientImpl client = new ClientImpl();
        client.setBankomat(bankomat);
        new Thread(client, "Name " + clientId).start();
    }
}
