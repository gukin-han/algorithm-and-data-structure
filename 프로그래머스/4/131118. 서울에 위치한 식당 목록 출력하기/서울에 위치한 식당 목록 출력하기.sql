-- 코드를 입력하세요
SELECT
r.rest_id
, i.rest_name
, i.food_type
, i.favorites
, i.address
, round(avg(r.review_score), 2) score
from rest_review r
inner join rest_info i
on r.rest_id = i.rest_id
where i.address like '서울%'
group by r.rest_id
order by score desc, i.favorites desc