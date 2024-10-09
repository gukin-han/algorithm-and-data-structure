-- 코드를 입력하세요
SELECT
pg.price_group
, count(p.product_id) as products
from product p
inner join (
    select
    product_id
    , (price div 10000) * 10000 as price_group
    from product
) pg
on p.product_id = pg.product_id
group by pg.price_group
order by pg.price_group asc