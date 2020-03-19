package by.sugako.fairyTale;

public class Vnuchka {

    public static final int VNUCHKA_SHARE = 15;

    public Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaExceeption {
        if(leftWeight > VNUCHKA_SHARE) {

            Zhuchka zhuchka = new Zhuchka();
            return zhuchka.pullRepka(repka, leftWeight - VNUCHKA_SHARE);
        } else {
            return repka;
        }
    }
}
