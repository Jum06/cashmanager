package at.htlhl.cashmanager.controllers;

import at.htlhl.cashmanager.entities.Student;
import at.htlhl.cashmanager.repositories.StudentRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    @Operation(summary = "Get list of all students")
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @PostMapping
    @Operation(summary = "Create new Student")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentRepository.addStudent(student);
        return ResponseEntity.ok("Student added successfully");
    }

    @GetMapping("/{className}")
    @Operation(summary = "Get all students of a class")
    public List<Student> getStudentsByClassName(@PathVariable String className) {
        return studentRepository.getStudentsByClassName(className);
    }
}
