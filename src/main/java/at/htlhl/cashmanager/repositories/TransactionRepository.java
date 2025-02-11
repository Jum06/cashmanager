package at.htlhl.cashmanager.repositories;

import at.htlhl.cashmanager.entities.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionRepository {

    private final JdbcTemplate jdbcTemplate;

    public TransactionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Transaction> transactionMapper = (rs, rowNum) ->
            new Transaction(
                    rs.getInt("id"),
                    rs.getInt("class_id"),
                    rs.getDouble("amount"),
                    rs.getTimestamp("timestamp").toLocalDateTime(),
                    rs.getString("description")
            );

    public List<Transaction> getAllTransactions() {
        return jdbcTemplate.query("SELECT * FROM transactions", transactionMapper);
    }

    public void addTransactionEntity(Transaction transaction) {
        jdbcTemplate.update("INSERT INTO transactions (class_id, amount, timestamp, description) VALUES (?, ?, ?, ?)",
                transaction.getClassId(), transaction.getAmount(), transaction.getTimestamp(), transaction.getDescription());
    }
}
