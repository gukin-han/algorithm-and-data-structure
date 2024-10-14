-- 코드를 입력하세요
with num_of_register as (
    select count(*) num_of_register from USER_INFO where USER_INFO.joined like '2021%'
)
SELECT
year(os.SALES_DATE) year, 
month(os.SALES_DATE) month, 
count(distinct os.user_id) purcharsed_users, 
round(count(distinct os.user_id)/num_of_register.num_of_register,1) purchased_ratio
from ONLINE_SALE os
join user_info ui on os.user_id = ui.user_id and ui.joined like '2021%'
cross join num_of_register
group by year(os.SALES_DATE), month(os.SALES_DATE)
order by year(os.SALES_DATE), month(os.SALES_DATE)