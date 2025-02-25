-- 코드를 작성해주세요
SELECT A.DEPT_ID, A.DEPT_NAME_EN, ROUND(SUM(B.SAL) / COUNT(B.DEPT_ID), 0) AS "AVG_SAL"
  FROM HR_DEPARTMENT A INNER JOIN HR_EMPLOYEES B ON A.DEPT_ID = B.DEPT_ID
GROUP BY A.DEPT_ID
ORDER BY AVG_SAL DESC