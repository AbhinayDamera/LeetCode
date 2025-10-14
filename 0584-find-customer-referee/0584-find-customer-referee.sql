# Write your MySQL query statement below
-- select Customer from referee_id where referee_id!=2 or referee_id =null
select name
from customer
where referee_id != 2 or referee_id is NULL