# Write your MySQL query statement below
SELECT id, 'Root' AS type FROM Tree
WHERE p_id IS NULL
union
SELECT id, 'Inner' AS type FROM Tree
WHERE id IN (SELECT DISTINCT p_id FROM Tree WHERE p_id NOT IN (SELECT id FROM Tree WHERE p_id IS NULL))
union
SELECT id, 'Leaf' AS type FROM Tree
WHERE id NOT IN (SELECT DISTINCT p_id FROM Tree WHERE p_id IS NOT NULL) AND p_id IS NOT NULL
ORDER BY id;