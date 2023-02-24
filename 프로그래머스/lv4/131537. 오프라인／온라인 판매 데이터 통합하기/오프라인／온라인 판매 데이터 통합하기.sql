SELECT DATE_FORMAT(SALES_DATE, "%Y-%m-%d") AS SALES_DATE,PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE AS ONSA
WHERE DATE_FORMAT(SALES_DATE, "%Y%m") = '202203'
UNION ALL
SELECT DATE_FORMAT(SALES_DATE, "%Y-%m-%d") AS SALES_DATE,PRODUCT_ID, 
    NULL AS USER_ID, 
    SALES_AMOUNT
FROM OFFLINE_SALE AS OFSA
WHERE DATE_FORMAT(SALES_DATE, "%Y%m") = '202203'
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID;