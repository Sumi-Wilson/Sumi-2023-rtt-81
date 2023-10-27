select 
   avg( IF(status = 'Shipped', 1, 0) )AS Shipped,
   avg( IF(status = 'Cancelled', 1, 0)) AS Cancelled
FROM
    orders;
