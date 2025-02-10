package at.htlhl.cashmanager.repositories;

import at.htlhl.cashmanager.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
