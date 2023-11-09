-- 코드를 입력하세요
SELECT count(*)
from USER_INFO
where to_char(joined,'yyyy')='2021' and age >=20 and age<=29