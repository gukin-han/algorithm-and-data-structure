-- 코드를 작성해주세요
with emp_data as (
    select
    he.emp_no
    , he.emp_name
    , he.sal
    , case 
        when avg(hg.score) >= 96 then 'S'
        when avg(hg.score) >= 90 then 'A'
        when avg(hg.score) >= 80 then 'B'
        else 'C'
    end grade
    from HR_GRADE hg
    inner join HR_EMPLOYEES he on he.emp_no = hg.emp_no
    group by he.emp_no
)

select
emp_no
, emp_name
, grade
, case 
    when grade = 'S' then sal * 0.2
    when grade = 'A' then sal * 0.15
    when grade = 'B' then sal * 0.1
    else 0
end bonus
from emp_data
