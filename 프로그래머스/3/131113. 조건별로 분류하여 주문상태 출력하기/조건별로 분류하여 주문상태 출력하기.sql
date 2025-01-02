-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, TO_CHAR(OUT_DATE,  'YYYY-mm-DD'), 
CASE WHEN OUT_DATE <= TO_DATE('2022-05-01', 'YYYY-mm-DD') THEN '출고완료'
     WHEN OUT_DATE > TO_DATE('2022-05-01', 'YYYY-mm-DD') THEN '출고대기'
     ELSE '출고미정' END AS "출고여부"
  from FOOD_ORDER
 order by ORDER_ID ASC;
 