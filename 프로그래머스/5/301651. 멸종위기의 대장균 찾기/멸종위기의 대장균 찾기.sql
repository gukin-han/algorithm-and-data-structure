-- 코드를 작성해주세요
with recursive cte as (
    select e.id, e.parent_id, 1 generation from ECOLI_DATA e where e.parent_id is null
    
    union all
    
    select e.id, e.parent_id, cte.generation + 1 from ECOLI_DATA e
    inner join cte on cte.id = e.parent_id
)

select count(*) count, c1.generation from cte c1
left join cte sub on c1.id = sub.parent_id
where sub.id is null
group by c1.generation
order by c1.generation