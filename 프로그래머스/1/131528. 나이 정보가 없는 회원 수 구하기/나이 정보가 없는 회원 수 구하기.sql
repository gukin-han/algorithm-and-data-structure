-- 코드를 입력하세요
SELECT count(case when age is null then 1 end) as USERS from user_info