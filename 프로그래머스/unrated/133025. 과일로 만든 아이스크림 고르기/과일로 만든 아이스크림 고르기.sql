-- 코드를 입력하세요
SELECT ICECREAM_INFO.FLAVOR
from FIRST_HALF ,ICECREAM_INFO 
where FIRST_HALF.FLAVOR = ICECREAM_INFO.FLAVOR and
total_order >=3000 and INGREDIENT_TYPE = 'fruit_based'
order by total_order desc