package by.sugako.lesson18.casheer;

import by.sugako.lesson18.bankomat.Bankomat;

public class CashierImpl implements Cashier, Runnable {

    private Bankomat bankomat;

    public CashierImpl(Bankomat bankomat) {
        this.bankomat = bankomat;
    }

    @Override
    public void addMoney(Integer amount) {
        System.out.println("Cashier add: " + amount + ".00 BYN");
        bankomat.add(amount);
        bankomat.printBalance();
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                addMoney(5_000);
                Thread.sleep(5_000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
