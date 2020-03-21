package by.sugako.lesson11.inheritance;

public class Tshirt extends UnderWear {

    boolean hasPrint;

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt();
        System.out.println(tshirt.hasPrint);
        System.out.println(tshirt.color);
        System.out.println(tshirt.material);
        System.out.println(tshirt.size);
        System.out.println(tshirt.hasRubber);
        System.out.println(tshirt.hashCode());
    }
}
