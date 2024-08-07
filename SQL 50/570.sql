-- Write your PostgreSQL query statement below
SELECT
    manager.name
FROM
    Employee manager
JOIN
    Employee employee
    ON manager.id = employee.managerId
GROUP BY
    manager.id, manager.name
HAVING
    Count(employee.id) >= 5;
