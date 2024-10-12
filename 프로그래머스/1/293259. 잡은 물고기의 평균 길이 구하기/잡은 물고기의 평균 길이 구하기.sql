-- 코드를 작성해주세요
with adjusted_fish_length as (
    select
    case when length is null then '10'
    else length
    end as length
    from fish_info
)

select round(avg(afl.length), 2) as average_length
from adjusted_fish_length afl

