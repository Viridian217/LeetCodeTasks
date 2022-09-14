# Write your MySQL query statement below
SELECT employee_id,
IF (Employees.employee_id % 2 = 1 AND !(Employees.name LIKE 'M%'),Employees.salary, 0) AS bonus
FROM Employees ORDER BY employee_id;