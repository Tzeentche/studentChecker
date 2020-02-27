package task6;

//      Имеются три числа - день, месяц, год. Вывести в виде трех чисел дату следующего дня.

import java.util.InputMismatchException;
import java.util.Scanner;

public class DayMonthYear {

    public static void main(String[] args) {

        int[] days = new int[3];
        String[] names = {"DD", "MM", "YY"};

        Scanner scan = new Scanner(System.in);

        try {

            for (int i = 0; i < days.length; i++) {
                System.out.println("Please, enter day, month and year at format " + names[i]);
                days[i] = scan.nextInt();
            }
            scan.close();

        } catch(InputMismatchException ex) {

            System.out.println("You did something wrong. Try again!");
        }

        System.out.println("Next day date is " + userInput(days));
    }

    static String userInput(int[] date) {

        String tomorrow = "";

        for (int i = 0; i < date.length; i++) {
            tomorrow += Integer.toString(date[i]) + ":";
        }
        return tomorrow;
    }
}
