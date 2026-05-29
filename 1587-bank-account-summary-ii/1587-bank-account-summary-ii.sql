# Write your MySQL query statement below

SELECT us.name, SUM(ts.amount) as BALANCE
from USERS us
Join Transactions ts
on us.account=ts.account
GROUP BY us.name
HAVING BALANCE>10000;

-- SELECT us.name,
--        SUM(ts.amount) AS BALANCE
-- FROM Users us
-- JOIN Transactions ts
-- ON us.account = ts.account
-- GROUP BY us.name
-- HAVING BALANCE > 10000;