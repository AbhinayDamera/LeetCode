# Write your MySQL query statement below
Select customer_number 
from orders
GROUP BY customer_number 
ORDER BY COUNT(order_number) DESC
LIMIT 1;
