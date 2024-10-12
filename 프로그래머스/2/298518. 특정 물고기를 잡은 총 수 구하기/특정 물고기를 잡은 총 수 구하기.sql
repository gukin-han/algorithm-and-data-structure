-- 코드를 작성해주세요
select
sum(case when fni.fish_name in ('BASS', 'SNAPPER') then 1 else 0 end) FISH_COUNT
from FISH_INFO fi
inner join FISH_NAME_INFO fni
on fi.fish_type = fni.fish_type