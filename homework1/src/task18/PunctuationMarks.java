package task18;

//      Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
//      Рекомендуемый текст: "Окна; во всех. корпусах были, ярко?? освещены? И оттого! На громадном, дворе казалось, что очень темно.".

import java.util.*;

public class PunctuationMarks {

    public static void main(String[] args) {

        PunctuationMarks punctuationMarks = new PunctuationMarks();

        String someText = punctuationMarks.usersText();
        String[] textArray = punctuationMarks.textTerminator(someText);
        int quantity = punctuationMarks.counter(textArray);
        punctuationMarks.outputResult(quantity);
    }

    String usersText() {

        String usersTextIs = "";

        try {
            System.out.println("Please, enter some text with punctuation marks:");
            Scanner scn = new Scanner(System.in);
            usersTextIs = scn.nextLine();
            scn.close();
        } catch(InputMismatchException ex) {

            System.out.println("Please, try again/ And next time be more carefully!");
        }

        return usersTextIs;
    }

    String[] textTerminator(String someText) {

        String[] textArray = someText.split("[.,:;+!?]");
        return textArray;
    }

    int counter(String[] punctuations) {

        int counter = punctuations.length;
        return counter;
    }

    void outputResult(int punctuationsQuantity) {

        System.out.println("There are " + punctuationsQuantity + " punctuation marks in your text");
    }
}
