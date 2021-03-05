package edu.javacourse.student.rest;

import edu.javacourse.student.StudentResponse;
import edu.javacourse.student.service.StudentService;
import edu.javacourse.student.view.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<StudentResponse> getStudentInfo(StudentRequest request) {

        return getStudentInfo(request);
    }
}
