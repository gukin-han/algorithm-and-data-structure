-- 코드를 작성해주세요
select
i.item_id
, i.item_name
from ITEM_INFO i
inner join item_tree t
on t.item_id = i.item_id
and t.parent_item_id is null