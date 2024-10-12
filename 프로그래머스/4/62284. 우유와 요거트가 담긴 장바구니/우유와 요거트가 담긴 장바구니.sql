-- 코드를 입력하세요
with 
    cart_milk_only as (
    select 
        id
        , cart_id
    from CART_PRODUCTS
    where name = 'Milk'
    ),
    cart_yogurt_only as (
    select
        id
        , cart_id
    from CART_PRODUCTS
    where name = 'Yogurt'
    )

select 
distinct cmo.cart_id
from cart_milk_only cmo
inner join cart_yogurt_only cyo
on cmo.cart_id = cyo.cart_id
order by cmo.id