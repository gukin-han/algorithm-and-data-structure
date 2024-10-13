-- 코드를 입력하세요
with adjusted_plan as (
    select plan_id, car_type, replace(duration_type, '일 이상', '') duration_type, discount_rate
    from CAR_RENTAL_COMPANY_DISCOUNT_PLAN plan
)

SELECT 
history.history_id, 
case 
    when plan.duration_type is not null then round((1 - plan.discount_rate/100) * car.DAILY_FEE * (datediff(history.end_date, history.start_date) + 1))
    else round(car.DAILY_FEE * (datediff(history.end_date, history.start_date) + 1)) 
end FEE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY history
inner join CAR_RENTAL_COMPANY_CAR car 
    on car.car_id = history.car_id
left join adjusted_plan plan 
    on plan.car_type = car.car_type and datediff(history.end_date, history.start_date) + 1 >= plan.duration_type * 1
where car.car_type = '트럭'
group by history.history_id
order by fee desc, history_id desc
