package edu.javacourse.student;

import javax.persistence.*;
import java.time.LocalDate;

public class StudentResponse {

    private String documentNumber;
    private LocalDate documentDate;
    private LocalDate expireDate;
    private String facultyName;
    private String universityName;
    private String studentForm;
}
