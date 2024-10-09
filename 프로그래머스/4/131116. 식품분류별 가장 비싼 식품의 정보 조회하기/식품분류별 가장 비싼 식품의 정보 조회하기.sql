-- 코드를 입력하세요
select
    fp.category
    , fp.price as max_price 
    , fp.product_name 
from food_product fp
inner join (
    select
        category
        , max(price) as max_price
    from food_product
    group by category
) max_price_per_category
on fp.category = max_price_per_category.category
and fp.price = max_price_per_category.max_price
and fp.category in ('과자', '국', '김치', '식용유')
order by fp.price desc