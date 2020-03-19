package task21;

//      Напишите два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String, а другой с помощью
//      StringBuilder и метода append. Сравните скорость их выполнения.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Performance {

    public static void main(String[] args) {

        Performance performance = new Performance();
        String usersText = performance.usersInput();
        String[] someSplittedSentence = performance.usersTextSplitter(usersText);
        String concatTextIs = performance.concatenator(someSplittedSentence);
        StringBuffer appendYextIs = performance.bufferConcatenator(someSplittedSentence);
        performance.outputResult(concatTextIs);
        performance.outputResult(appendYextIs);
    }

    String usersInput() {
        String usersSentenceIs = "";
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, enter random sentence:");

        try {
            usersSentenceIs = scn.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println("You entered wrong sentence. Please, next time be more carefully, and enter correct.");
        }
        return usersSentenceIs;
    }

    String[] usersTextSplitter(String incomingText) {
        String[] textArray = incomingText.split("[.]");
        return textArray;
    }

    String concatenator(String[] incomingArray) {
        String resultIs = "";
        for(int i = 0; i < incomingArray.length; i++) {
            resultIs += incomingArray[i];
        }
        return resultIs;
    }

    StringBuffer bufferConcatenator(String[] incomingArrayForBuffering) {
        StringBuffer bufferResultIs = new StringBuffer();
        for(int i = 0; i < incomingArrayForBuffering.length; i++) {
            bufferResultIs.append(incomingArrayForBuffering[i]);
        }
        return bufferResultIs;
    }

    void outputResult(String stringConcat) {
        System.out.println("Concatenation result is: " + stringConcat + "!");
    }

    void outputResult(StringBuffer stringAppend) {
        System.out.println("Append result is: " + stringAppend + "!");
    }
}
