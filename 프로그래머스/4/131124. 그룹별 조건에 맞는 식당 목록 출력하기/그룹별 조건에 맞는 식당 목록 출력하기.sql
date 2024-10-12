-- 코드를 입력하세요
with most_review_count as(
    select
        count(*) max_count
    from rest_review
    group by member_id
    order by count(*) desc
    limit 1
), 
review_count_member_id as(
    select 
        rr.member_id,
        count(*) review_count
    from REST_REVIEW rr
    inner join MEMBER_PROFILE mp on rr.member_id = mp.member_id
    group by rr.member_id
),
most_reviewed_member_id as(
    select
        rcm.member_id
    from review_count_member_id rcm
    cross join most_review_count mrc
    where rcm.review_count = mrc.max_count
)

select mp.member_name, rr.review_text, date_format(rr.review_date, '%Y-%m-%d') review_date from REST_REVIEW rr
inner join member_profile mp on mp.member_id = rr.member_id
inner join most_reviewed_member_id mrm on mrm.member_id = mp.member_id
order by rr.review_date, rr.review_text

