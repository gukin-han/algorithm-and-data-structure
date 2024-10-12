-- 코드를 입력하세요
SELECT
c.car_id,
round(avg(datediff(c.end_date, c.start_date) + 1),1) as AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY c
group by c.car_id having AVERAGE_DURATION >= 7
order by AVERAGE_DURATION desc, c.car_id desc

# select * from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# order by car_id