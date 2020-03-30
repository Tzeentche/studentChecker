package by.sugako.lesson17;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Hello from thread runnable: " + Thread.currentThread().getName());
                Thread.currentThread().sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
