# Write your MySQL query statement below

SELECT MAX(num) AS num FROM MyNumbers
where num in(
    SELECT num
    FROM MyNumbers
    Group By num
    having count(*)=1
)