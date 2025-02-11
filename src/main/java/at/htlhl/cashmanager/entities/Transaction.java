package at.htlhl.cashmanager.entities;

import java.time.LocalDateTime;

public class Transaction {
    private int id;
    private int classId;
    private double amount;
    private LocalDateTime timestamp;
    private String description;

    public Transaction() {}

    public Transaction(int id, int classId, double amount, LocalDateTime timestamp, String description) {
        this.id = id;
        this.classId = classId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
