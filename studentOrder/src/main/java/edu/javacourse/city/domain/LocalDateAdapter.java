package edu.javacourse.city.domain;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlJavaTypeAdapter<String, LocalDate> {

   
}
