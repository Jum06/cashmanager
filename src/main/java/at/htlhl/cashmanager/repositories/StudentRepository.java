package at.htlhl.cashmanager.repositories;

import at.htlhl.cashmanager.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Student> studentMapper = (rs, rowNum) ->
            new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("class_id")
            );

    public List<Student> getAllStudents() {
        return jdbcTemplate.query("SELECT * FROM students", studentMapper);
    }

    public void addStudent(Student student) {
        jdbcTemplate.update("INSERT INTO students (name, class_id) VALUES (?, ?)",
                student.getName(), student.getClassId());
    }

    public List<Student> getStudentsByClassName(String className) {
        String sql = """
            SELECT students.id, students.name, students.class_id
            FROM students
            JOIN classes ON students.class_id = classes.id
            WHERE classes.name = ?
        """;
        return jdbcTemplate.query(sql, studentMapper, className);
    }
}
