-- Write your PostgreSQL query statement below
-- Columns: id, movie, description, rating
SELECT * FROM Cinema
WHERE
    Cinema.id % 2 = 1 AND
    Cinema.description != 'boring'
ORDER BY
    Cinema.rating DESC;
