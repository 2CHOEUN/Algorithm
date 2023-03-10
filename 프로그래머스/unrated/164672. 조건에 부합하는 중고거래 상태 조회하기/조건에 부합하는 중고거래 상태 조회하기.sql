-- 코드를 입력하세요
SELECT BOARD_ID,WRITER_ID,TITLE,PRICE,
decode(STATUS,'DONE','거래완료','SALE','판매중','RESERVED','예약중') as STATUS
FROM USED_GOODS_BOARD
where to_char(CREATED_DATE,'yyyy-mm-dd') like '2022-10-05'
ORDER BY BOARD_ID desc