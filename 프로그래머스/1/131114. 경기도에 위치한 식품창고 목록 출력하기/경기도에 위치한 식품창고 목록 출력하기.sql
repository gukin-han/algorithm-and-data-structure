-- 코드를 입력하세요
SELECT warehouse_id, warehouse_name, address, 
coalesce(freezer_yn, 'N') AS FREEZER_YN
from FOOD_WAREHOUSE
where ADDRESS like '경기도%'
order by warehouse_id