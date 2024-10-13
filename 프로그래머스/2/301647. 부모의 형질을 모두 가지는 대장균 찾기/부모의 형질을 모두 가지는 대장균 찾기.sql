-- 코드를 작성해주세요

select child.id, child.GENOTYPE, parent.GENOTYPE as parent_genotype from ECOLI_DATA child
inner join ECOLI_DATA parent
on child.parent_id = parent.id
and parent.GENOTYPE & child.GENOTYPE = parent.GENOTYPE
order by child.id asc