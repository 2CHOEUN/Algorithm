-- 코드를 입력하세요
SELECT 
    DISTINCT(B.USER_ID), NICKNAME,
    CITY || ' ' || STREET_ADDRESS1 || ' ' || STREET_ADDRESS2 AS "전체주소", 
    SUBSTR(TLNO,0,3) || '-'|| SUBSTR(TLNO,4,4) || '-'|| SUBSTR(TLNO,-4,4) AS "전화번호" 
FROM 
    USED_GOODS_BOARD A , USED_GOODS_USER B
WHERE 
    WRITER_ID = B.USER_ID AND 
    USER_ID IN (SELECT WRITER_ID
                FROM USED_GOODS_BOARD
               GROUP BY WRITER_ID
               HAVING COUNT(WRITER_ID) >=3)
ORDER BY 
    B.USER_ID DESC