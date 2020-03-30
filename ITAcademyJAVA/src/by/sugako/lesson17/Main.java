package by.sugako.lesson17;

public class Main {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);
        System.out.println("Thread name =" + mainThread.getName());
        System.out.println("Thread id=" + mainThread.getId());
        System.out.println("Thread group name=" + mainThread.getThreadGroup().getName());
        System.out.println("Thread priority=" + mainThread.getPriority());

        FirstThread firstThread = new FirstThread();
        System.out.println("firstThread.getState=" + firstThread.getState());
        firstThread.start();
        System.out.println("firstThread.getState=" + firstThread.getState());
        firstThread.stop();
        new FirstThread().start();
        new FirstThread().start();
        new FirstThread().start();

        new Thread(new SecondThread()).start();
        new Thread(new SecondThread()).start();
        new Thread(new SecondThread()).start();
        new Thread(new SecondThread()).start();
    }
}
