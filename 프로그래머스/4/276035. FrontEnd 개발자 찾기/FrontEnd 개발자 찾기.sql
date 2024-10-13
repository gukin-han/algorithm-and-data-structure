-- 코드를 작성해주세요
select 
d.id, d.email, d.first_name, d.last_name
from DEVELOPERS d
inner join (
    select sum(code) sum_code from SKILLCODES where category = 'Front End'
) codes
on d.skill_code & codes.sum_code
order by d.id asc

