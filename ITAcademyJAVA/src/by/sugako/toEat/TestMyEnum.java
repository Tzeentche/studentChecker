package by.sugako.toEat;

import java.util.Arrays;

public class TestMyEnum {

    public static void main(String[] args) {

        MyEnum myEnum1 = MyEnum.BREAFAST;
//        System.out.println(myEnum1 + " " + myEnum1.ordinal() + " " + myEnum1.getMenu());

        MyEnum myEnum2 = MyEnum.valueOf("DINNER");
//        System.out.println(myEnum2 + " " + myEnum2.ordinal() + " " + myEnum2.getMenu());

        System.out.println(Arrays.toString(MyEnum.values()));
    }
}
