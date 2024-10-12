-- 코드를 입력하세요
with max_views_board_id as (
    select
    max(views) max_view
    from USED_GOODS_BOARD 
)


SELECT
concat('/home/grep/src/', ugf.BOARD_ID, '/', ugf.file_id, ugf.FILE_NAME, ugf.FILE_EXT) as FILE_PATH
from USED_GOODS_BOARD ugb
inner join USED_GOODS_FILE ugf on ugb.board_id = ugf.board_id
inner join max_views_board_id mvbi on mvbi.max_view = ugb.views
order by ugf.FILE_ID desc
