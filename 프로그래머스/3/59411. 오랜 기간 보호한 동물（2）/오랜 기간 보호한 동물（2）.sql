-- 코드를 입력하세요
SELECT
i.animal_id
, i.name
from animal_ins i
inner join animal_outs o 
on i.animal_id = o.animal_id
and o.datetime is not null
and i.datetime < o.datetime
order by TIMEDIFF(o.datetime, i.datetime) desc, DATEDIFF(o.datetime, i.datetime) desc
limit 2