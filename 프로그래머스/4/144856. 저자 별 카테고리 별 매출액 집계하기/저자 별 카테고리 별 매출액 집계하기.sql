SELECT 
    B.AUTHOR_ID AS AUTHOR_ID,
    B.AUTHOR_NAME AS AUTHOR_NAME,
    A.CATEGORY AS CATEGORY,
    SUM(A.PRICE * C.SALES) AS TOTAL_SALES
FROM BOOK A
JOIN AUTHOR B ON A.AUTHOR_ID = B.AUTHOR_ID
JOIN BOOK_SALES C ON A.BOOK_ID = C.BOOK_ID
WHERE TO_CHAR(C.SALES_DATE, 'YYYY-MM') = '2022-01'
GROUP BY B.AUTHOR_ID, B.AUTHOR_NAME, A.CATEGORY
ORDER BY B.AUTHOR_ID ASC, A.CATEGORY DESC;
