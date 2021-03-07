package edu.javacourse.student.service;

import edu.javacourse.student.Student;
import edu.javacourse.student.StudentDocument;
import edu.javacourse.student.StudentResponse;
import edu.javacourse.student.dao.StudentRepository;
import edu.javacourse.student.view.StudentRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;
    public List<StudentResponse> getStudentInfo(StudentRequest request) {

        List<Student> student = studentRepository.findStudent(request.getLastName(),
                                      request.getFirstName(),
                                      request.getMiddleName(),
                                      request.getDateOfBirth(),
                                      request.getPassportSeria(),
                                      request.getPassportNumber(),
                                      request.getPassportDate());

        if(student.isEmpty()) {

            return Collections.EMPTY_LIST;

        }

        List<StudentDocument> docs = student.get(0).getDocuments();
        List<StudentResponse> result = docs.stream().map(d -> getResponse(d)).collect(Collectors.toList());

        return result;
    }

    private StudentResponse getResponse(StudentDocument doc) {

        StudentResponse sr = new StudentResponse();
        sr.setDocumentNumber(doc.getDocumentNumber());
        sr.setDocumentDate(doc.getDocumentDate());
        sr.setExpireDate(doc.getExpireDate());
        sr.setFacultyName(doc.getFaculty().getFacultyName());
        sr.getUniversityName(doc.getFaculty().getUniversity().getUniversityName());
        sr.setStudentForm(doc.getStudentForm().toString());

        return sr;
    }
}
