package by.sugako.fairyTale;

public class Koshka {

    public static final int KOSHKA_SHARE = 5;

    public Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaExceeption {

        if(leftWeight > KOSHKA_SHARE) {

            Mouse mouse = new Mouse();
            return mouse.pullRepka(repka, leftWeight - KOSHKA_SHARE);
        } else {
            return repka;
        }
    }
}
