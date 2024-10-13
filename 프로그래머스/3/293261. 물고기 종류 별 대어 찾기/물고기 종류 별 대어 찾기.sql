-- 코드를 작성해주세요
with max_length as (
    select 
    fi.fish_type, max(fi.length) max_length
    from FISH_INFO fi
    inner join FISH_NAME_INFO fni on fi.FISH_TYPE = fni.FISH_TYPE
    group by fi.fish_type
)

select 
fi.id
, fni.fish_name
, fi.length
from FISH_INFO fi
inner join FISH_NAME_INFO fni on fi.fish_type = fni.fish_type
inner join max_length ml on fi.fish_type = ml.fish_type and fi.length = ml.max_length

