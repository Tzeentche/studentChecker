package task19;

//      Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть,
//      что слова также могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы,
//      но могут и отсутствовать.

import java.util.*;

public class WordsValue {

    public static void main(String[] args) {

        WordsValue wordsValue = new WordsValue();
        String usersInput = wordsValue.inputText();
        String[] splitetdSentence = wordsValue.splitUsersText(usersInput);
        int resultIs = wordsValue.wordsCounter(splitetdSentence);
        wordsValue.output(resultIs);
    }

    String inputText() {
        String usersText = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Please, enter some text with few words:");

        try{
            usersText = scn.nextLine();
            scn.close();

        } catch (InputMismatchException ex) {
            System.out.println("Mistake found. Please, next time be more careful and input STRING text!");
        }
        usersText = usersText.trim();

        return usersText;
    }

    String[] splitUsersText(String incomingText) {
        String[] splitUsersText = incomingText.split(" +");

        return splitUsersText;
    }

    int wordsCounter(String[] incomingTextArray) {
        int counter = incomingTextArray.length;
        return counter;
    }

    void output(int usersTextWordsValueIs) {
        System.out.println("Your sentence consist with " + usersTextWordsValueIs + " words. That's al...");
    }
}
