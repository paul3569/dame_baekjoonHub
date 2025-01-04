-- 코드를 입력하세요
SELECT USER_ID
      ,NICKNAME
      ,a AS "전체주소"
      ,b AS "전화번호"
  FROM (
      SELECT b.USER_ID
      ,b.NICKNAME
      ,CONCAT(b.CITY, ' ',  b.STREET_ADDRESS1, ' ', b.STREET_ADDRESS2) AS "a"
      ,CONCAT(SUBSTRING(b.TLNO, 1, 3), '-', SUBSTRING(b.TLNO, 4, 4), '-', SUBSTRING(b.TLNO, -4, 4)) AS "b"
      ,COUNT(a.BOARD_ID) AS cnt
      FROM USED_GOODS_BOARD a inner join USED_GOODS_USER b ON a.WRITER_ID = b.USER_ID
    GROUP BY b.USER_ID
    HAVING cnt >= 3
    ORDER BY b.USER_ID DESC
    ) tbl