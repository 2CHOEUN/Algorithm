-- 코드를 입력하세요
SELECT CAR_ID,round(avg(end_date-start_date+1),1)as AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by CAR_ID
having avg(end_date-start_date+1)>7
order by AVERAGE_DURATION desc ,CAR_ID desc