package by.sugako.lesson17;

public class Main2 {

    public static void main(String[] args) {
        new Thread(new PersonThread(), "Man").start();
        new Thread(new PersonThread(), "Woman").start();
    }

}

class PersonThread implements Runnable {

    @Override
    public void run() {
        Room room = Room.getInstance();
        room.occupy();
        room.release();
    }
}
