package by.sugako.lesson15.fairyTale;

public class Babka {

    public static final int BABKA_SHARE = 20;

    public Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaExceeption {
        if(leftWeight > BABKA_SHARE) {
//            NEED HEEEELP!!!!
            Vnuchka vnuchka = new Vnuchka();
            return vnuchka.pullRepka(repka, leftWeight - BABKA_SHARE);
        } else {
            return repka;
        }
    }
}
