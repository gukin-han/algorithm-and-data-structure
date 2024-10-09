-- 코드를 작성해주세요
select
count(fi.fish_type) as fish_count
, max(fni.fish_name) as fish_name
from fish_info fi
inner join FISH_NAME_INFO fni
on fi.fish_type = fni.fish_type
group by fi.fish_type
order by count(fi.fish_type) desc