-- 코드를 입력하세요
SELECT 
HISTORY_ID,CAR_ID,to_char(START_DATE,'yyyy-mm-dd') START_DATE,to_char(END_DATE,'yyyy-mm-dd') END_DATE,
CASE WHEN end_date-start_date >= 29 THEN '장기 대여' ELSE '단기 대여' END as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where to_char(START_DATE,'yyyy-mm') ='2022-09'
order by HISTORY_ID desc