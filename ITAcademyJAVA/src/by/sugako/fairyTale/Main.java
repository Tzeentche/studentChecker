package by.sugako.fairyTale;

public class Main {

    public static void main(String[] args) {
        try {

            Ded ded = new Ded();
            ded.plantRepka();
            ded.growRepka(76);
            Repka repka = ded.pullRepka();

            System.out.println(repka);

        } catch (VeryBigRepkaExceeption e){
            e.printStackTrace();
        } finally {
            System.out.println("Tut i skazke konec, a kto slushal - molodec!");
        }
    }
}
