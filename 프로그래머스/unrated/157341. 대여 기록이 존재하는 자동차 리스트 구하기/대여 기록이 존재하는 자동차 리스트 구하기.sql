-- 코드를 입력하세요
SELECT distinct(a.CAR_ID)
FROM CAR_RENTAL_COMPANY_CAR a,CAR_RENTAL_COMPANY_RENTAL_HISTORY b
WHERE a.CAR_ID = b.CAR_ID
    and a.CAR_TYPE = '세단' 
    and a.CAR_ID = b.CAR_ID 
    and to_char(START_DATE,'yyyy-mm') >= '2022-10'
ORDER BY a.CAR_ID DESC
