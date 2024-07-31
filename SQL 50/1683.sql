-- Write your PostgreSQL query statement below
SELECT tweet_ID
FROM Tweets
WHERE CHAR_LENGTH(content) > 15;