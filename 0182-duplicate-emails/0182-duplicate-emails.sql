# Write your MySQL query statement below

-- with tot_emails as(
-- select email, count(*) as email_count
-- from person
-- group by email

-- )

-- select email 
-- from tot_emails
-- where email_count>1;

select email
from person
group by email
Having count(*)>1;