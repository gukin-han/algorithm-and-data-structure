-- 코드를 입력하세요
with combined as (
    select SHIPMENT_ID, FLAVOR, TOTAL_ORDER from FIRST_HALF
    union all
    select SHIPMENT_ID, FLAVOR, TOTAL_ORDER from JULY
)

SELECT 
max(flavor) flavor
from combined
group by flavor
order by sum(TOTAL_ORDER) desc
limit 3