package at.htlhl.cashmanager.repositories;

import at.htlhl.cashmanager.entities.ClassEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassRepository {

    private final JdbcTemplate jdbcTemplate;

    public ClassRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<ClassEntity> classMapper = (rs, rowNum) ->
            new ClassEntity(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("balance")
            );

    public List<ClassEntity> getAllClasses() {
        return jdbcTemplate.query("SELECT * FROM classes", classMapper);
    }

    public void addClass(ClassEntity classEntity) {
        jdbcTemplate.update("INSERT INTO classes (name, balance) VALUES (?, ?)",
                classEntity.getName(), classEntity.getBalance());
    }
}
