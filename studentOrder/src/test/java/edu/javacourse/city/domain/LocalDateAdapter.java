package edu.javacourse.city.domain;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @Override
    public LocalDate unmarshal(String s) throws Exception {
        return LocalDate.parse(v, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    @Override
    public String marshal(LocalDate localDate) throws Exception {
        return v.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
