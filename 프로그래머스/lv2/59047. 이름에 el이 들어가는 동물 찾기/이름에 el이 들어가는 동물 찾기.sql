-- 코드를 입력하세요
SELECT ANIMAL_ID, name from ANIMAL_INS
where ANIMAL_TYPE = "Dog" and instr(NAME,'EL') 
order by name