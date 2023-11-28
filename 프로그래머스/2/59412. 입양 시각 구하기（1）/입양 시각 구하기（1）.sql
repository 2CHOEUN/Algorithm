-- 코드를 입력하세요
SELECT to_char(DATETIME,'hh24') as hour, count(to_char(DATETIME,'hh24')) as count
from ANIMAL_OUTS
where to_char(DATETIME,'hh24') BETWEEN 09 AND 19
group by to_char(DATETIME,'hh24')
order by to_char(DATETIME,'hh24')