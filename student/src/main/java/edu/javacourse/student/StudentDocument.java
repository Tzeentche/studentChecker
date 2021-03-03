package edu.javacourse.student;

import javax.persistence.*;

@Table(name = "sr_student_document")
@Entity
public class StudentDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_Id")
    private Long documentId;
    @Column(name = "document_number")
    private String documntNumber;
    @Column(name = "document_date")
    private String documntDate;
    @Column(name = "expire_date")
    private String expireDate;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne (cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;
    @Column(name = "student_form")
    @Enumerated
    private StudentForm studentFrom;

    public Long getDocumentId() {
        StudentForm.DAY.ordinal();
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getDocumntNumber() {
        return documntNumber;
    }

    public void setDocumntNumber(String documntNumber) {
        this.documntNumber = documntNumber;
    }

    public String getDocumntDate() {
        return documntDate;
    }

    public void setDocumntDate(String documntDate) {
        this.documntDate = documntDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public StudentForm getStudentFrom() {
        return studentFrom;
    }

    public void setStudentFrom(StudentForm studentFrom) {
        this.studentFrom = studentFrom;
    }
}
