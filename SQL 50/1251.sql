-- Write your PostgreSQL query statement below
-- Columns: product_id, average_price
SELECT
    Prices.product_id,
    COALESCE(ROUND(SUM(Prices.price * UnitsSold.units)::numeric / SUM(UnitsSold.units), 2), 0) AS average_price
FROM
    Prices
LEFT JOIN
    UnitsSold
ON
    Prices.product_id = UnitsSold.product_id
    AND UnitsSold.purchase_date BETWEEN Prices.start_date AND Prices.end_date
GROUP BY
    Prices.product_id;
