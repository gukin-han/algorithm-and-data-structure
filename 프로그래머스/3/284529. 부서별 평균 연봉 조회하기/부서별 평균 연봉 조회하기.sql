-- 코드를 작성해주세요
select
e.dept_id
, d.dept_name_en
, round(avg(e.sal)) as AVG_SAL
from HR_EMPLOYEES e
join HR_DEPARTMENT d on e.dept_id = d.dept_id 
group by e.dept_id
order by AVG_SAL desc