-- 코드를 입력하세요
SELECT price - price % 10000 price_group, count(*) products
from product
group by price - price % 10000
order by price - price * 10000 desc