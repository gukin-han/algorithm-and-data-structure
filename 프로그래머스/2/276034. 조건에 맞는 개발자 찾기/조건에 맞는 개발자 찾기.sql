select id, email, first_name, last_name
from DEVELOPERS
where SKILL_CODE & (
    select sum(code) from skillcodes where name in ('Python','C#')
)
order by id asc

# SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
# FROM DEVELOPERS
# WHERE SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE NAME IN ('Python', 'C#'))
# ORDER BY ID ASC;