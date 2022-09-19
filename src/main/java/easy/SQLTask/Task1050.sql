# Write your MySQL query statement below
SELECT DISTINCT actor_id, director_id FROM ActorDirector a1
WHERE (
          SELECT COUNT(timestamp)
          FROM ActorDirector a2
          WHERE a1.actor_id = a2.actor_id AND a1.director_id = a2.director_id
      ) > 2
