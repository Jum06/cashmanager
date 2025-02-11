INSERT INTO classes (name, balance) VALUES ('4AHITS', 500.00);
INSERT INTO classes (name, balance) VALUES ('5BHITS', 1000.00);

INSERT INTO transactions (class_id, amount, description) VALUES (1, -50.00, 'Bought school supplies');
INSERT INTO transactions (class_id, amount, description) VALUES (2, 200.00, 'Class fundraiser');

INSERT INTO students (name, class_id) VALUES ('Alice', 1);
INSERT INTO students (name, class_id) VALUES ('Bob', 1);
INSERT INTO students (name, class_id) VALUES ('Charlie', 2);
