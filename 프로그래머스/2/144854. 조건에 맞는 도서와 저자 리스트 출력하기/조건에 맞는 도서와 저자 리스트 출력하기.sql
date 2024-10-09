-- 코드를 입력하세요
SELECT
b.book_id,
a.author_name,
DATE_FORMAT(b.published_date, '%Y-%m-%d') as PUBLISHED_DATE
from book b
inner join author a on a.author_id = b.author_id and b.category = '경제'
order by PUBLISHED_DATE asc