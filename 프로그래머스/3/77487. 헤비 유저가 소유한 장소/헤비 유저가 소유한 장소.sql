-- 코드를 입력하세요
SELECT *
  FROM PLACES
 WHERE HOST_ID IN (SELECT A.HOST_ID FROM PLACES A GROUP BY A.HOST_ID HAVING COUNT(A.ID) > 1)
ORDER BY ID