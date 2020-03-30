package by.sugako.lesson17;

public class FirstThread extends Thread {

    @Override
    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Hello from thread " + getName());
                sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
