# Write your MySQL query statement below
update Salary
SET sex=
case sex
when 'm' then 'f'
when 'f' then 'm'
END;
