-- 코드를 작성해주세요

with cumulative_score_for_employee as (
    select
        sum(score) as score_sum
        , emp_no
    from hr_grade
    group by emp_no
    
)

select 
csfe.score_sum as score
, he.emp_no
, he.emp_name
, he.position
, he.email
from HR_EMPLOYEES he
inner join cumulative_score_for_employee csfe
on csfe.emp_no = he.emp_no
order by csfe.score_sum desc
limit 1
