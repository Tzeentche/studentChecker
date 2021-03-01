package edu.javacourse.student.domain;

import javax.persistence.*;

@Table(name = "sr_university")
@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_Id")
    private Long universityId;
    @Column(name = "university_named")
    private Long universityName;
}
