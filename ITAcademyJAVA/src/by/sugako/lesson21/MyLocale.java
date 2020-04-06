package by.sugako.lesson21;

import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class MyLocale {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());

        Locale localeBy = new Locale("be", "BY");
        System.out.println(localeBy);
        System.out.println(localeBy.getDisplayCountry());
        System.out.println(localeBy.getDisplayLanguage());

      System.out.println(Arrays.toString(locale.getAvailableLocales()));

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println(numberFormat.format(10500.99));
        numberFormat = NumberFormat.getCurrencyInstance(localeBy);
        System.out.println(numberFormat.format(10500.99));

        numberFormat = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        System.out.println(numberFormat.format(10500.99));

        Locale localeDe = new Locale("ccp", "IN");

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeDe);
        System.out.println(dateFormat.format(new Date()));

//        Locale locale2 = new Locale("en", "UK");

        try {
            DateFormat df =
                    DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
            Date parseDate = df.parse("10/15/10");
            System.out.println(parseDate);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
