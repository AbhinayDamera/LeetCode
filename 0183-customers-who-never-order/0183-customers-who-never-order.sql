# Write your MySQL query statement below

select c.name as customers
from Customers c
left join Orders o on c.id=o.customerId 
where o.customerId IS NULL;

-- SELECT c.name as Customers 
-- FROM Customers c
-- LEFT JOIN Orders o 
-- ON c.id = o.customerId
-- WHERE o.customerId IS NULL;