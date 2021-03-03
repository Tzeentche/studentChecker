package edu.javacourse.student;

import javax.persistence.*;
import java.util.List;

@Table(name = "sr_university")
@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_Id")
    private Long universityId;
    @Column(name = "university_named")
    private Long universityName;
    @OneToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY, mappedBy = "university")
    private List<Faculty> faculties;

    public Long getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }

    public Long getUniversityName() {
        return universityName;
    }

    public void setUniversityName(Long universityName) {
        this.universityName = universityName;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }
}
