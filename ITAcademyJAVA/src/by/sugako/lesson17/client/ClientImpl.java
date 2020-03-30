package by.sugako.lesson17.client;

import by.sugako.lesson17.bankomat.Bankomat;

public class ClientImpl {


    public void setBankomat(Bankomat bankomat) {
        this.bankomat = bankomat;
    }

    @Override
    public Integer getMoney(int amount) throws NoSuchAmountException {
        System.out.println("Client asked: " + amount + ".00 BYN");
        Integer getAmount = bankomat.get(bankomat);
        System.out.println("Bankomat give " + getAmount + ".00 BYN");
        return getAmount;
    }

    @Override
    public void run() {
        while(bankomat.isOpen()) {
            try {
                clientMoney += getMoney(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Client " + Thread.currentThread().getName() + " have " + clientMoney + ".00 BYN");
        }
    }
}
