-- 코드를 입력하세요
with combined_sale as(
    select 
        sales_date,
        product_id,
        sales_amount,
        user_id
    from online_sale
    
    union all
    
    select 
        sales_date,
        product_id,
        sales_amount,
        null user_id
    from OFFLINE_SALE
)

SELECT
    date_format(sales_date, '%Y-%m-%d') SALES_DATE,
    product_id,
    user_id,
    sales_amount
from combined_sale
where sales_date like '2022-03%'
order by sales_date asc, product_id asc, user_id asc