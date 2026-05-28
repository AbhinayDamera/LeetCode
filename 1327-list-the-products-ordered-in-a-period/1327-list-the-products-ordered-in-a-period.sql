# Write your MySQL query statement below
SELECT product_name, SUM(O.unit) as unit
from Products P
Join Orders O 
ON P.product_id=O.product_id
Where order_date BETWEEN ' 2020-02-01' AND  '2020-02-29' 
GROUP BY P.product_name
HAVING SUM(O.unit)>=100;