-- 코드를 입력하세요
SELECT
ri.food_type
, ri.rest_id
, ri.rest_name
, ri.favorites
from REST_INFO ri
inner join (
    select
    food_type
    , max(favorites) as max_favorite
    from REST_INFO
    group by food_type
) mf
on ri.food_type = mf.food_type
and ri.favorites = mf.max_favorite
order by ri.food_type desc