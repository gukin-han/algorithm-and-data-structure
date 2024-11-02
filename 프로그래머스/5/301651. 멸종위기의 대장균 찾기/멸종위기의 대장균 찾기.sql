-- 코드를 작성해주세요
with recursive cte as (
    select id, parent_id, 1 generation  from ECOLI_DATA where parent_id is null
    
    union all
    
    select child.id, child.parent_id, parent.generation + 1 from cte parent 
    inner join ECOLI_DATA child 
    on parent.id = child.parent_id
)

select count(*) count, parent.generation from cte parent
left join cte child
on parent.id = child.parent_id
where child.id is null
group by parent.generation
order by parent.generation