-- 코드를 입력하세요
with total_rent as (
    select
    distinct c.car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY c
    where c.start_date >= '2022-08-01' and c.start_date < '2022-11-01'
    group by c.car_id having count(*) >= 5
)

SELECT
month(c.start_date) month,
c.car_id,
count(*) records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY c
inner join total_rent t on t.car_id = c.car_id
where c.start_date >= '2022-08-01' and c.start_date < '2022-11-01'
group by month(c.start_date), c.car_id 
order by month(c.start_date) asc, c.car_id desc

