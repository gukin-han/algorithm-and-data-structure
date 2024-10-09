-- 코드를 입력하세요

with available_car_id as(
    SELECT
        car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where '2022-10-16' between start_date and end_date
    order by car_id
)

select 
    distinct h.car_id
    , case
        when aci.car_id is null then '대여 가능'
        else '대여중'
    end as availability
from CAR_RENTAL_COMPANY_RENTAL_HISTORY h
left join available_car_id aci
on aci.car_id = h.car_id
order by h.car_id desc
