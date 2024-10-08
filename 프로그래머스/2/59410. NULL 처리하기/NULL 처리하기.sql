-- 코드를 입력하세요
SELECT ANIMAL_TYPE, coalesce(name, 'No name') AS NAME, sex_upon_intake
from animal_ins
order by animal_id
