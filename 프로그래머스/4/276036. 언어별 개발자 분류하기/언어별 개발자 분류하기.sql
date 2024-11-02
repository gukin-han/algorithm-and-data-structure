-- 코드를 작성해주세요
with a as (
    select (s1.code + s2.code) as code from SKILLCODES s1
    cross join SKILLCODES s2
    where s2.name = 'Python'
    and s1.category = 'Front End'
), result as (

select 
case 
    when (d.skill_code & a.code = a.code) then 'A'
    when (d.skill_Code & b.code = b.code) then 'B'
    when (d.skill_code & c.code = c.code) then 'C'
end as grade, 
    d.id, 
    d.email
from DEVELOPERS d
inner join a
inner join SKILLCODES b on b.name = 'C#'
inner join skillcodes c on c.category = 'Front End'
where case 
    when (d.skill_code & a.code = a.code) then 'A'
    when (d.skill_Code & b.code = b.code) then 'B'
    when (d.skill_code & c.code = c.code) then 'C'
end is not null
)

select min(grade) grade, id, email from result
group by id, email
order by min(grade) asc, id

