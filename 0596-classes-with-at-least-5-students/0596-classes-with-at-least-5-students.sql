# Write your MySQL query statement below
#Select class
#from Courses 
#Group by class
#Having count(class)>=5
#order by count(class) DESC;

SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(class) >= 5;