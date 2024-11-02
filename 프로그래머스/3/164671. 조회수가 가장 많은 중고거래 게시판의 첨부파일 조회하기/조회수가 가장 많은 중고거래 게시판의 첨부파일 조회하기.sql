-- 코드를 입력하세요

with most_view as (
    select *
    from USED_GOODS_BOARD
    order by views desc
    limit 1
)

select concat('/home/grep/src/', ugf.board_id,'/', ugf.file_id, ugf.file_name, ugf.file_ext) as fild_path from most_view mv
inner join used_goods_file ugf
on mv.board_id = ugf.board_id
order by ugf.file_id desc