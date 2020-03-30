package by.sugako.lesson18.client;

import by.sugako.lesson18.bankomat.Bankomat;

public class ClientImpl implements Client, Runnable {

    private Bankomat bankomat;
    private int clientMoney;

    public void setBankomat(Bankomat bankomat) {
        this.bankomat = bankomat;
    }

    @Override
    public Integer getMoney(int amount) throws NoSuchAmountException {
        System.out.println("Client asked: " + amount + ".00 BYN");
        Integer getAmount = bankomat.get(amount);
        System.out.println("Bankomate give " + getAmount + ".00 BYN");
        return getAmount;
    }

    @Override
    public void run() {
        while(bankomat.isOpen()) {
            try {
                clientMoney += getMoney(1000);
            } catch (NoSuchAmountException e) {
                e.printStackTrace();
            }
            System.out.println("Client " + Thread.currentThread().getName() + " have " + clientMoney + ".00 BYN");
        }
    }
}
