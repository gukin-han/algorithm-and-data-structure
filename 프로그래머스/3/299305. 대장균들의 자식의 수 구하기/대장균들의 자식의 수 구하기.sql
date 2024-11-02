-- 코드를 작성해주세요
select p.id, sum(case when c.PARENT_ID is not null then 1 else 0 end) as child_count FROM ECOLI_DATA p
left join ECOLI_DATA c
on p.id = c.parent_id
group by p.id