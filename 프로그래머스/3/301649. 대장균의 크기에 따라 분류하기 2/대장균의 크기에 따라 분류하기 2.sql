WITH ranked_size AS (
    SELECT
        id,
        (RANK() OVER (ORDER BY size_of_colony DESC)) / COUNT(*) OVER () AS pct
    FROM ECOLI_DATA
)

select
    id,
    case
        when pct >= 0 and pct <= 0.25 then 'CRITICAL'
        when pct > 0.25 and pct <= 0.5 then 'HIGH'
        when pct > 0.50 and pct <= 0.75 then 'MEDIUM'
        else 'LOW'
    end COLONY_NAME
from ranked_size
order by id