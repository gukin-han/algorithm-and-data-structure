-- 코드를 입력하세요
SELECT 
car_type,
    COUNT(CASE 
            WHEN options LIKE '%통풍시트%' 
              OR options LIKE '%열선시트%' 
              OR options LIKE '%가죽시트%' 
            THEN 1 
         END) as cars
FROM CAR_RENTAL_COMPANY_CAR
group by car_type
order by car_type asc