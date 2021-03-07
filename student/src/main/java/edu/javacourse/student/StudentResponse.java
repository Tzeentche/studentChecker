package edu.javacourse.student;

import edu.javacourse.student.view.LocalDateAdapter;

import javax.persistence.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class StudentResponse {

    private String documentNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate documentDate;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate expireDate;
    private String facultyName;
    private String universityName;
    private String studentForm;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getUniversityName(Long universityName) {
        return this.universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getStudentForm() {
        return studentForm;
    }

    public void setStudentForm(String studentForm) {
        this.studentForm = studentForm;
    }
}
