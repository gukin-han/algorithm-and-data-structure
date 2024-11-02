-- 코드를 입력하세요
with most_frequent_reviewer as (
    select member_id, count(*)
    from REST_REVIEW
    group by MEMBER_ID
    order by count(*) desc 
    limit 1
)

select member_name, review_text, date_format(review_date, '%Y-%m-%d') as review_date
from REST_REVIEW rr
inner join MEMBER_PROFILE mp
on rr.member_id = mp.member_id
inner join most_frequent_reviewer mfr
on rr.member_id = mfr.member_id
order by review_date asc, review_text asc
