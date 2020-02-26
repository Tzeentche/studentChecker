package by.sugako.arrays;

import java.util.*;

public class Arrayserr {

    public static void main(String[] args) {

        int[] array1;
        array1 = new int[10];

        int array2[] = {1, 2, 3, 4};
        printArray(array1);
        printArray(array2);

        String[] arrayStrings = new String[6];

        printArray(arrayStrings);

        System.out.println(arrayStrings[5]);
        System.out.println(Arrays.toString(arrayStrings));
    }

    static void printArray(int[] arrayInts) {

        for(int i = 0; i < arrayInts.length; i++) {

            System.out.print(" [" + i + "]= " + arrayInts[i] + ";");
        }
        System.out.println();
    }

    static void printArray(String[] arrayInts) {

        for(int i = 0; i < arrayInts.length; i++) {

            System.out.print(" [" + i + "]= " + arrayInts[i] + ";");
        }
        System.out.println();
    }
}
