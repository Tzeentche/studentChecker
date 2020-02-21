package by.sugako.bits;

public class BitWiseOperations {

    public static void main(String[] args) {

        int b1 = 0b0110;
        int b2 = 0b0011;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(Integer.toBinaryString(b1 & b2));
        System.out.println(Integer.toBinaryString(b1 | b2));
        System.out.println(Integer.toBinaryString(b1 ^ b2));
        System.out.println(Integer.toBinaryString(~~b1));
        System.out.println(Integer.toBinaryString(~~b2));
        System.out.println();
    }
}
