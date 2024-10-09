-- 코드를 입력하세요
SELECT
u.user_id, u.nickname
, concat(u.city, ' ', u.street_address1, ' ', u.street_address2) as '전체주소'
, CONCAT(SUBSTRING(u.TLNO, 1, 3), '-', SUBSTRING(u.TLNO, 4, 4), '-', SUBSTRING(u.TLNO, 8, 4)) AS '전화번호'
from USED_GOODS_BOARD b
inner join USED_GOODS_USER u
on b.writer_id = u.user_id
group by b.writer_id having count(b.writer_id) >= 3
order by 1 desc