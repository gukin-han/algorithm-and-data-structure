-- 코드를 작성해주세요
with adjusted_fish_info as (
    select
    id, fish_type, time,
    case when length is null then 10
    else length
    end adjusted_length
    from fish_info
)

select 
count(*) fish_count
, max(adjusted_length) max_length
, fish_type
from adjusted_fish_info
group by fish_type having avg(adjusted_length) > 33
order by fish_type asc