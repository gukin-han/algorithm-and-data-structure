-- 코드를 입력하세요
SELECT year(sales_Date) year, month(sales_Date) month, gender, count(distinct os.user_id) as users
from ONLINE_SALE os
inner join user_info ui
on os.user_id = ui.user_id
group by year(sales_date), month(sales_date), gender having gender is not null
order by year(sales_date), month(sales_date), gender