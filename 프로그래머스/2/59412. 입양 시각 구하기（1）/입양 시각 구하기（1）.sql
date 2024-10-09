-- 코드를 입력하세요
SELECT 
cast(substring(datetime, 12, 2) as UNSIGNED) as HOUR,
count(*) as COUNT
from animal_outs
group by HOUR having hour >= '9' AND hour < 20
order by HOUR