-- 코드를 작성해주세요
with adjusted_data as (
    select *,
    case
        when month(ed.DIFFERENTIATION_DATE) between 1 and 3 then '1Q'
        when month(ed.DIFFERENTIATION_DATE) between 4 and 6 then '2Q'
        when month(ed.DIFFERENTIATION_DATE) between 7 and 9 then '3Q'
        else '4Q'
    end QUARTER
    from ecoli_data ed
)

select 
quarter, 
count(*) ecoli_count
from adjusted_data
group by quarter
order by quarter asc
