package by.sugako.lesson10.beans;

import java.util.Properties;

public class Car2 {

    private Properties properties = new Properties();

    public int getYear() {
        return (Integer) properties.get("year");
    }

    public void setYear(int year) {
        properties.put("year", year);
    }
}
