-- 코드를 작성해주세요
select count(*) count from ECOLI_DATA
where GENOTYPE & 2 != 2 -- 2번이 없는 경우
and (GENOTYPE & 1 = 1 OR GENOTYPE & 4 = 4 ) -- 1번 혹은 3번이 있는 경우