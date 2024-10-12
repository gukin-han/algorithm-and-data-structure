select 
year(os.sales_date) as year,
month(os.sales_date) * 1 as month,
ui.GENDER,
count(distinct os.user_id) USERS
from ONLINE_SALE os
inner join USER_INFO ui on os.user_id = ui.user_id and ui.GENDER is not null
group by year, month, ui.gender
order by year asc, month asc, ui.gender asc