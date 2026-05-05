# Write your MySQL query statement below

-- select c.name
-- from Customers c
-- join Orders o on c.id=o.customerId 
-- where o.customerId NOT NULL;

SELECT c.name as Customers 
FROM Customers c
LEFT JOIN Orders o 
ON c.id = o.customerId
WHERE o.customerId IS NULL;