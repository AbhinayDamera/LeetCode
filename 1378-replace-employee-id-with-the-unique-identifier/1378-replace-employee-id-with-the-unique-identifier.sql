# Write your MySQL query statement below
SELECT unique_id, name
from Employees em
left join EmployeeUNI eu 
on em.id=eu.id
