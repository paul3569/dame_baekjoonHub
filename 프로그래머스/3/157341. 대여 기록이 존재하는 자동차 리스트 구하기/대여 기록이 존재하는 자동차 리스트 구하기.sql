-- 코드를 입력하세요
SELECT A.CAR_ID
  FROM CAR_RENTAL_COMPANY_CAR A INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B ON A.CAR_ID = B.CAR_ID
 WHERE A.CAR_TYPE = '세단'
   AND B.START_DATE >= '2022-10-01'
GROUP BY A.CAR_ID
ORDER BY A.CAR_ID DESC