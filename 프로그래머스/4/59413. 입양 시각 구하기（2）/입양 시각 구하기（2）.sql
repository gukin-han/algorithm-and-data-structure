WITH RECURSIVE cte AS (
  SELECT 0 AS HOUR
  UNION ALL
  SELECT HOUR + 1 FROM cte WHERE HOUR < 23
)
SELECT cte.HOUR, count(hour(ao.datetime))
FROM cte
left join animal_outs ao
on cte.HOUR = hour(ao.datetime)
group by cte.HOUR
