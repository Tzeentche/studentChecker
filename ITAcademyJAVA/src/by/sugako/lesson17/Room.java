package by.sugako.lesson17;

public class Room {

    private static Room room = new Room();
    private final Seat seat = new Seat();

    public static Room getInstance() {
        return room;
    }

    public void occupy() {
        synchronized (seat) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + " calls occupy()");
            try {
                if(thread.getName().equals("Man")) {
                    seat.wait(5000);
                    System.out.println(thread.getName() + " in wait");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void release() {
        synchronized (seat) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + " calls release()");
            if(thread.getName().equals("Woman")) {
                seat.notifyAll();
            }
        }
    }
}

class Seat {

}
