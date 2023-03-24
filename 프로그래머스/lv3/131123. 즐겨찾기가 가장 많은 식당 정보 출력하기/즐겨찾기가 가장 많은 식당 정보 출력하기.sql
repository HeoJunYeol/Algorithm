SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO
WHERE FAVORITES IN (
    SELECT MAX(FAVORITES) 
    FROM REST_INFO 
    GROUP BY FOOD_TYPE
    )
GROUP BY FOOD_TYPE 
ORDER BY FOOD_TYPE DESC;