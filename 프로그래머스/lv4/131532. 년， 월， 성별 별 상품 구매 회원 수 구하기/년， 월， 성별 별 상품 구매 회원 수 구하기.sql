SELECT YEAR(O.SALES_DATE) AS YEAR, 
    MONTH(O.SALES_DATE) AS MONTH, 
    GENDER, 
    COUNT(DISTINCT U.USER_ID) USERS
FROM USER_INFO U
JOIN ONLINE_SALE O ON U.USER_ID = O.USER_ID
WHERE U.GENDER IS NOT NULL
GROUP BY YEAR, MONTH, GENDER
ORDER BY YEAR, MONTH, GENDER;