package at.htlhl.cashmanager.controllers;

import at.htlhl.cashmanager.models.ClassEntity;
import at.htlhl.cashmanager.repositories.ClassRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {

    private final ClassRepository classRepository;

    public ClassController(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }


    @GetMapping
    @Operation(summary = "get all classes")
    public List<ClassEntity> getAllClasses() {
        return classRepository.findAll();
    }

    @PostMapping
    @Operation(summary = "create a class")
    public ClassEntity createClass(@RequestBody ClassEntity classEntity) {
        return classRepository.save(classEntity);
    }
}