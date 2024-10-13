-- 코드를 작성해주세요 parent는 업그레이드 하기 전
select
child.item_id,
child.item_name,
child.rarity
from ITEM_INFO child
join item_tree it on child.item_id = it.item_id
join item_info parent on parent.item_id = it.parent_item_id and parent.rarity = 'RARE'
order by child.item_id desc
