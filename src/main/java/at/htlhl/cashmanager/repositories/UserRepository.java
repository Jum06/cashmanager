package at.htlhl.cashmanager.repositories;

import at.htlhl.cashmanager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
