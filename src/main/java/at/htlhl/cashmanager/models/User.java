package at.htlhl.cashmanager.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassEntity classEntity;
}

enum Role {
    STUDENT, CASHIER, ADMIN
}