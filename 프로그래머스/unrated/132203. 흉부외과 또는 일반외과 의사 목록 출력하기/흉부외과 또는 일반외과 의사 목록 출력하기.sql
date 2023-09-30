SELECT DR_NAME, DR_ID, MCDP_CD, to_char(HIRE_YMD,'YYYY-mm-dd')
FROM DOCTOR
where MCDP_CD = 'CS' or MCDP_CD = 'GS'
order by HIRE_YMD desc, DR_NAME