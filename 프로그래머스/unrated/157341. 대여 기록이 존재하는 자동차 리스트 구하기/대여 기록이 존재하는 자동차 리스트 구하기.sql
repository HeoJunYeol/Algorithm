SELECT DISTINCT(C.CAR_ID)
FROM CAR_RENTAL_COMPANY_CAR C
LEFT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H ON C.CAR_ID = H.CAR_ID AND C.CAR_TYPE = "세단"
WHERE H.START_DATE LIKE "2022-10%"
ORDER BY C.CAR_ID DESC;
