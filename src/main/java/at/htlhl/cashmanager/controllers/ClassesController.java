package at.htlhl.cashmanager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classes")
public class ClassesController {

    @GetMapping("")
    public String index() {
        return "Hello World!";
    }
}
