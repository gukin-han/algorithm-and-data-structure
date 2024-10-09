-- 코드를 입력하세요
SELECT
p.id
, p.name
, p.host_id
from PLACES p
inner join (
    select 
    host_id as heavy_id
    from PLACES
    group by host_id
    having count(*) >= 2
) as heavy
on p.host_id = heavy.heavy_id
order by p.id