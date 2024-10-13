-- 코드를 작성해주세요
with max_size_per_year as(
    select year(DIFFERENTIATION_DATE) year, max(size_of_colony) max_size
    from ECOLI_DATA
    group by year(DIFFERENTIATION_DATE)
    order by year(DIFFERENTIATION_DATE)
)

select
year,
mspy.max_size - ed.SIZE_OF_COLONY YEAR_DEV,
id
from ECOLI_DATA ed
inner join max_size_per_year mspy
on mspy.year = year(ed.DIFFERENTIATION_DATE)
order by year, YEAR_DEV
