-- Write your PostgreSQL query statement below
SELECT 
    currDay.id 
FROM 
    Weather currDay
WHERE EXISTS (
    SELECT 1
    FROM Weather prevDay
    WHERE 
        currDay.temperature > prevDay.temperature
        AND currDay.recordDate = prevDay.recordDate + 1
);
