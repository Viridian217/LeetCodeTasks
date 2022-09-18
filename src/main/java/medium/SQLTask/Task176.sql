# Write your MySQL query statement below
SELECT DISTINCT (SELECT MAX(salary) FROM Employee WHERE salary NOT IN (SELECT MAX(salary) FROM Employee)) AS SecondHighestSalary
FROM Employee;