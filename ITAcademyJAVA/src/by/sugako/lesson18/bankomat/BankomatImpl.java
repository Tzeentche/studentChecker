package by.sugako.lesson18.bankomat;

public class BankomatImpl implements Bankomat {

    private final Cash money = new Cash();
    private boolean isOpen = true;

    @Override
    public Integer get(int targetAmount) {
        synchronized (money) {
            if (targetAmount > money.getAmount()) {
                try {
                    money.wait(7_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            money.minus(targetAmount);
        }
        return targetAmount;
    }

    @Override
    public void add(Integer amount) {
        synchronized (money){
            money.plus(amount);
            money.notifyAll();
        }
    }

    @Override
    public void printBalance() {
        synchronized (money) {
            System.out.println("In bankomat " + money + ".00 BYN");
        }
    }

    @Override
    public void close() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
