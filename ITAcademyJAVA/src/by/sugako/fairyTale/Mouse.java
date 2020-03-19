package by.sugako.fairyTale;

public class Mouse {

    public static final int MOUSE_SHARE = 1;

    public Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaExceeption {
        if(leftWeight > MOUSE_SHARE) {

            throw new VeryBigRepkaExceeption("Repka left weight is " + (leftWeight - MOUSE_SHARE));
        }else {
            return repka;
        }

    }
}
