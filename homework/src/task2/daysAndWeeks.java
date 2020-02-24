package task2;

public class daysAndWeeks {

    public static void main(String[] args) {

        int s = 37060;
        int sec;
        int m;
        int min, h;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;

        System.out.println(h + " часов " + min + " минут " + sec + " секунд");

        int days;
        int weeks;

        days = h % 24;

        weeks = days % 7;

        System.out.println("Дней " + days + " недель " + weeks);

    }
}
