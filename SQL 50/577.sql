-- Write your PostgreSQL query statement below
-- Columns: name, bonus
SELECT 
    Employee.name,
    Bonus.bonus
FROM 
    Employee
LEFT JOIN 
    Bonus
ON
    Employee.empId = Bonus.empId
WHERE 
    Bonus.bonus < 1000
    OR Bonus.bonus IS NULL;
