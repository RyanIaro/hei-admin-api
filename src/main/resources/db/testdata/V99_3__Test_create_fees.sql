insert into "fee"
(id, user_id, type, comment,total_amount,  remaining_amount, status,creation_datetime, updated_at, due_datetime)
values
    ('fee4_id', 'student2_id', 'TUITION','Comment', 5000, 5000, 'LATE','2021-11-08T08:25:24.00Z','2023-02-08T08:30:24.00Z','2021-12-09T08:25:25.00Z'),
    ('fee5_id', 'student2_id', 'HARDWARE','Comment', 5000, 5000, 'LATE','2021-11-08T08:25:24.00Z','2023-02-08T08:30:24.00Z','2021-12-08T08:25:25.00Z'),
    ('fee6_id', 'student1_id', 'TUITION','Comment', 5000, 5000, 'LATE','2021-11-08T08:25:24.00Z','2023-02-08T08:30:24.00Z','2021-12-09T08:25:25.00Z'),
    ('fee7_id', 'student1_id', 'TUITION','Comment', 100000, 0, 'UNPAID', default,null,'2023-04-03T08:25:25.00Z'),
    ('fee8_id', 'student1_id', 'TUITION','Comment', 200000, 0, 'LATE',default,null,'2023-04-01T08:25:25.00Z');
