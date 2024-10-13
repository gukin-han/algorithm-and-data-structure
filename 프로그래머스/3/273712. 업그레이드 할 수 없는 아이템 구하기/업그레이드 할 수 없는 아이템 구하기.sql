-- 코드를 작성해주세요
with upgradable_item_list as (
    select
    distinct ii2.item_name
    from item_info ii
    inner join item_tree it on it.item_id = ii.item_id
    left join item_info ii2 on ii2.item_id = it.parent_item_id
    where ii2.item_name is not null
)

select 
ii.item_id, ii.item_name, ii.rarity
from item_info ii 
left join upgradable_item_list uil on uil.item_name = ii.item_name
where uil.item_name is null
order by ii.item_id desc
