package task6;

//      Имеются три числа - день, месяц, год. Вывести в виде трех чисел дату следующего дня.

import java.util.*;

public class DayMonthYear {

    static int[] days = new int[3];
    static String[] names = {"Day", "Month", "Year"};

    public static void main(String[] args) {

        DayMonthYear daMoYe = new DayMonthYear();
        daMoYe.userInput();
    }

    static void userInput() {

        Scanner scan = new Scanner(System.in);

        try {

            for (int i = 0; i < days.length; i++) {
                System.out.println("Please, enter number of the " + names[i] + ":");
                days[i] = scan.nextInt();
            }
            scan.close();

            if((days[0] > 31) | (days[0] <= 0)) {
                    System.out.println("Day is impossible! Please, try again and enter correct date!");
                    System.exit(0);

            } else if((days[1] > 12) || (days[1] <= 0)) {
                    System.out.println("Month is impossible! Please, try again and enter correct moth!");
                    System.exit(0);

            } else if ((days[2] < 0) | (days[2] > 99)) {
                    System.out.println("Year is impossible! Please, try again and enter correct year!");
                    System.exit(0);
                }

        } catch(InputMismatchException ex) {

            System.out.println("You did something wrong. Try again!");
            System.exit(-1);
        }

        System.out.println("Next day date is " + userOutput(days));
    }

    static String userOutput(int[] date) {

        String tomorrow = "";
        int[] check = revisor(date);

        if ((check[1] == 4 |
                check[1] == 6 |
                check[1] == 9 |
                check[1] == 11) && (check[0] == 30)) {

            check[1] += 1;
            check[0] = 1;

        } else if ((check[1] == 1 |
                check[1] == 3 |
                check[1] == 5 |
                check[1] == 7 |
                check[1] == 8 |
                check[1] == 10) && (check[0] == 31)) {
            check[1] += 1;
            check[0] = 1;

        } else if((check[1] == 12) && check[0] == 31) {
                check[2] += 1;

                if (check[2] == 100) {

                    check[2] = 00;
                }
                check[1] = 1;
                check[0] = 1;

        } else if ((check[2] % 4 != 0) && (check[1] == 2) && (check[0] == 28) || (check[2] % 4 == 0) && (check[1] == 2) && (check[0] == 29)) {
            check[1] += 1;
            check[0] = 1;

        } else {

            check[0] += 1;
        }

            for (int i = 0; i < check.length; i++) {

                if (check[i] < 10) {

                    tomorrow += "0";
                }

                if (i < (check.length - 1)) {

                    tomorrow += check[i] + ":";
                } else {
                    tomorrow += check[i];
                }
            }

        return tomorrow;
    }

    static int[] revisor(int[] date) {

        int[] today = new int[days.length];

        if ((date[2] % 4 != 0) && (date[1] == 2) && (date[0] > 28) || (date[2] % 4 == 0) && (date[1] == 2) && (date[0] > 29)) {
            System.out.println("Date is impossible! Please, try again and enter correct date!");
            System.exit(0);

        } else if ((date[1] == 4 | date[1] == 6 | date[1] == 9 | date[1] == 11) && (date[0] > 30)) {
            System.out.println("Date is impossible! Please, try again and enter correct date!");
            System.exit(0);

        } else {

            for (int i = 0; i < days.length; i++) {
                today[i] = date[i];
            }
        }
        return today;
    }
}
