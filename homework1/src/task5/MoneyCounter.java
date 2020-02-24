package task5;

//      Имеется целое число (любое), это число - сумма денег в рублях. Вывести это число, добавляя к нему слово "рублей" в правильном падеже.

import java.util.*;

public class MoneyCounter {

    public static void main(String[] args) {

        int money = 0;

        Scanner summ = new Scanner(System.in);

        try {

            System.out.println("Please, enter your's money value:");
            money = summ.nextInt();
            summ.close();

        } catch (InputMismatchException ex) {

            System.out.println("You input is not number. Please, try again!");
        }

        if((money % 10) >= 5) {

            System.out.println("You have " + money + " рублей.");

        } else if((money % 10) >= 2) {

            System.out.println("You have " + money + " рубля.");

        } else if((money % 10) == 1) {

            System.out.println("You have " + money + " рубль.");
        }
    }
}
