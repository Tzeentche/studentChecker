package edu.javacourse.student.domain;

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


}
