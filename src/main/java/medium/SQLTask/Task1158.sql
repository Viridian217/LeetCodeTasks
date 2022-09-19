# Write your MySQL query statement below
SELECT user_id AS buyer_id, join_date,
       (SELECT COUNT(buyer_id) FROM Orders o WHERE order_date LIKE '2019%' AND o.buyer_id = u.user_id) AS orders_in_2019
FROM Users u
GROUP BY user_id;