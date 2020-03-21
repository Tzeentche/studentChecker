package by.sugako.lesson15.fairyTale;

public class Ded {

    public static final int DED_SHARE = 25;
    private Repka repka;

    public void plantRepka() {
        repka = new Repka();
    }

    public void growRepka(int weight) {
        repka.grow(weight);
    }

    public Repka pullRepka() throws VeryBigRepkaExceeption {
        if(repka.getWeight() > DED_SHARE) {
            Babka babka = new Babka();
            return babka.pullRepka(repka, repka.getWeight() - DED_SHARE);
        } else {
            return repka;
        }
    }


}
