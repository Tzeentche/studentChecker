package by.sugako.lesson15.fairyTale;

public class Zhuchka {

    public static final int ZHUCHKA_SHARE = 10;

    public Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaExceeption {
        if(leftWeight > ZHUCHKA_SHARE) {

            Koshka koshka = new Koshka();
            return koshka.pullRepka(repka, leftWeight - ZHUCHKA_SHARE);
        } else {
            return repka;
        }
    }
}
