-- 코드를 작성해주세요
select count(*) as count from ECOLI_DATA
where GENOTYPE & 2 != 2 
AND (GENOTYPE & 1 = 1 or GENOTYPE & 4 = 4 )