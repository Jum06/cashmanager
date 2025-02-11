package at.htlhl.cashmanager.controllers;

import at.htlhl.cashmanager.entities.ClassEntity;
import at.htlhl.cashmanager.repositories.ClassRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClassController {

    private final ClassRepository classRepository;

    public ClassController(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @GetMapping
    @Operation(summary = "Get list of all classes")
    public List<ClassEntity> getAllClasses() {
        return classRepository.getAllClasses();
    }

    @PostMapping
    @Operation(summary = "Create new class")
    public ResponseEntity<String> addClass(@RequestBody ClassEntity classEntity) {
        classRepository.addClass(classEntity);
        return ResponseEntity.ok("Class added successfully");
    }
}
