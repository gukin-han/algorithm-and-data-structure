-- 코드를 입력하세요
SELECT
c.history_id
, c.car_id
, date_format(c.start_date, '%Y-%m-%d')
, date_format(c.end_date, '%Y-%m-%d')
, case when datediff(c.end_date, c.start_date) + 1 >= 30 then '장기 대여' else '단기 대여' end as 'RENT_TYPE'
from CAR_RENTAL_COMPANY_RENTAL_HISTORY c
where c.start_date >= '2022-09-01' and c.start_date < '2022-10-01'
order by c.history_id desc