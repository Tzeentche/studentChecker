package by.sugako.lesson21;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NewDateAPI {

    public static void main(String[] args) {

        long t2 = System.currentTimeMillis();
        long t1 = System.nanoTime();

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());

        long dif1 = System.nanoTime() - t1;
        long dif2 = System.currentTimeMillis() - t2;

        System.out.println(dif1 + " nano");
        System.out.println(dif2 + " mills");
    }
}
