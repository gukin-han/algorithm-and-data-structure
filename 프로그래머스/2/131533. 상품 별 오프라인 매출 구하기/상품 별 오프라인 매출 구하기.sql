-- 코드를 입력하세요
SELECT 
p.product_code as PRODUCT_CODE,
sum(os.sales_amount * p.price) as SALES
from offline_sale os
join product p 
on p.product_id = os.product_id
group by p.product_code
order by sales desc, p.product_code asc