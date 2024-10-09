-- 코드를 작성해주세요
select 
count(*) as fish_count
,date_format(time, '%m') * 1 as month
from FISH_INFO
group by month
order by month asc