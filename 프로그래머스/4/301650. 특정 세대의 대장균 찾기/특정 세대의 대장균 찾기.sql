-- 코드를 작성해주세요
with recursive cte as(
    select id, 0 as depth 
    from ECOLI_DATA
    where parent_id is null
    
    union all
    
    select ed.id, cte.depth + 1 from cte
    inner join ECOLI_DATA ed
    on cte.id = ed.parent_id where cte.depth < 2
)

select id from cte where depth = 2