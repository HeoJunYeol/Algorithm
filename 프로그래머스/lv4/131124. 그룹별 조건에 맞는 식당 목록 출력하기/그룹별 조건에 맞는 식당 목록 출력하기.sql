WITH most_reviews AS(
    SELECT 
            member_id,
            count(*) AS reviews
    FROM
            rest_review r
    GROUP BY
            member_id
    ORDER BY 
            reviews DESC
    LIMIT 1
)

SELECT 
        m.member_name,
        r.review_text,
        DATE_FORMAT(r.review_date, '%Y-%m-%d') AS review_date
FROM
        most_reviews mr
JOIN 
        member_profile m
ON 
        mr.member_id = m.member_id
JOIN
        rest_review r
ON 
        m.member_id = r.member_id
ORDER BY 
        review_date, review_text