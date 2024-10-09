-- 코드를 작성해주세요
select
date_format(ym,  '%Y') *1 YEAR
, round(avg(pm_val1), 2) 'PM10'
, round(avg(pm_val2), 2) 'PM2.5'
from AIR_POLLUTION
where location2 = '수원'
group by YEAR
order by YEAR asc