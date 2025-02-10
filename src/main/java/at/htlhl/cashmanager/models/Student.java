package at.htlhl.cashmanager.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassEntity classEntity;

    public Student(String firstName, String lastName, int classId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = Role.STUDENT;
    }


    public Student() {

    }


}

