-- 코드를 입력하세요
SELECT ID, NAME, HOST_ID
from places
where host_id in (select Host_id 
                  from places 
                  group by Host_id 
                  having count(host_id) >=2   )
order by id