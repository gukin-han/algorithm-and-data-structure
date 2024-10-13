with child_count as (
    select parent_id, count(*) as child_count
    from ECOLI_DATA ed
    group by ed.parent_id having parent_id is not null
)

select 
id
, case when child_count is null then 0
else child_count 
end child_count
from ECOLI_DATA ed
left join child_count cc
on cc.parent_id = ed.id
order by ed.id asc


