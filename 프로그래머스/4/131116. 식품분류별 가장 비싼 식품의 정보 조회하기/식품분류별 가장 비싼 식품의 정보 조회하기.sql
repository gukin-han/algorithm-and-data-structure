-- 코드를 입력하세요
with most_expensive_one as(
    select f.category, max(f.price) max_price
    from food_product f
    group by f.category
)

select fp.category, meo.max_price, fp.product_name
from food_product fp
inner join most_expensive_one meo
on fp.category = meo.category
AND fp.price = meo.max_price
where meo.category in ('과자', '국', '김치', '식용유')
order by meo.max_price desc