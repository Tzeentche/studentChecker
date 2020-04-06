package by.sugako.lesson21;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyGreatings {

    public static final String GREETINGS = "greetings";

    public static void main(String[] args) {
        ResourceBundle messages = ResourceBundle.getBundle("MyMessages", new Locale ("ru", "RU"));
        System.out.println(messages.getString(GREETINGS));

    }
}
