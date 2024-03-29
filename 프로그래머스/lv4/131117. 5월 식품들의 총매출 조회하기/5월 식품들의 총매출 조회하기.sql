SELECT FP.PRODUCT_ID, FP.PRODUCT_NAME, SUM(FP.PRICE * FO.AMOUNT) TOTAL_SALES
FROM FOOD_ORDER FO
JOIN FOOD_PRODUCT FP ON FO.PRODUCT_ID = FP.PRODUCT_ID
WHERE PRODUCE_DATE LIKE "2022-05%"
GROUP BY FP.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, FP.PRODUCT_ID;