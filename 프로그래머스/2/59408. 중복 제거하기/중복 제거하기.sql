-- 코드를 입력하세요
SELECT count(t1.animal_id) as count
from (select animal_id from animal_ins group by name having name is not null) as t1
