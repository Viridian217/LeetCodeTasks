# Write your MySQL query statement below
SELECT email FROM Person p1
GROUP BY email
HAVING COUNT(email) > 1;