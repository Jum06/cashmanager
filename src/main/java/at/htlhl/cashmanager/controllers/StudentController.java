package at.htlhl.cashmanager.controllers;

import at.htlhl.cashmanager.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("classes/class")
public class StudentController {

    @GetMapping("")
    public List<Student> index() {
        return List.of(
                new Student("Kevin", "Heart", 3),
                new Student("asdf", "d", 3),
                new Student("Kefdasvin", "f", 3)
        );
    }
}