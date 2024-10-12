-- 코드를 입력하세요
SELECT
a.author_id
, a.author_name
, b.category
, sum(bs.sales * b.price) total_sales
from BOOK_SALES bs
inner join BOOK b on b.book_id = bs.book_id and bs.sales_date like '2022-01%'
inner join AUTHOR a on a.author_id = b.author_id
group by a.author_id, b.category
order by a.author_id asc, b.category desc