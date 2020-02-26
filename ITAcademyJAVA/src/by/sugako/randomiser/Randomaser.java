package by.sugako.randomiser;

import java.util.*;

public class Randomaser {

    public static void main(String[] args) {

        int[] ints = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < ints.length; i++) {

            ints[i] = rnd.nextInt(6);
            Arrays.sort(ints);
            System.out.println(ints[i]);
        }

        System.out.println(Arrays.toString(ints));

        System.out.println(searchNumber(5, ints));
    }

    static int searchNumber(int target, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }

        return -1;
    }
}
