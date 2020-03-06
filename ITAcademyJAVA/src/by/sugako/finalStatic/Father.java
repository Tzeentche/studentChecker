package by.sugako.finalStatic;

public class Father {

    final String name;
    public static char sex = 'M';

    public Father(String name) {

        this.name = name;
    }

    public static void main(String[] args) {

        Father father1 = new Father("Rob");
        System.out.println(father1.sex);
        father1.sex = 'X';

        Father father2 = new Father("Bob");
        System.out.println(father2.sex);

        Father.printSex();
        System.out.println(Father.sex);
    }

    static void printSex() {

        System.out.println(sex);
    }
}
