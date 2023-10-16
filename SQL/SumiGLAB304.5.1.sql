SELECT id, SUM(quantity_ordered) as Qty,
    IF(MOD(SUM(quantity_ordered),2),'Odd', 'Even') as oddOrEven
FROM    orderdetails
GROUP BY    id
ORDER BY    id; 

SELECT TRUNCATE(1.555,1);

SELECT     product_id,
  ROUND(AVG(quantity_ordered * price_each)) as avg_order_item_value
FROM     orderdetails
GROUP BY    product_id;  

SELECT   TRUNCATE(1.999,1),  ROUND(1.999,1);

-- DATEDIFF()
SELECT DATEDIFF('2011-08-17','2011-08-17');
SELECT DATEDIFF('2011-08-17','2011-08-08'); 
SELECT DATEDIFF('2011-08-08','2011-08-17');  

select id,datediff(required_date,shipped_date) as daysleft
from orders
order by daysleft desc;


SELECT id, DATEDIFF(required_date, order_date) as remaining_days
FROM    orders
WHERE    status = 'In Process'
ORDER BY remaining_days;


SELECT 
  id,
   ROUND(DATEDIFF(required_date, order_date) / 7, 2),
    ROUND(DATEDIFF(required_date, order_date) / 30,2)
FROM     orders 
WHERE    status = 'In Process';


SELECT 
    id,
    DATE_FORMAT(order_date, '%m-%b-%Y') orderDate,
    DATE_FORMAT(required_date, '%a %D %b %Y') requireddate,
    DATE_FORMAT(shipped_date, '%W %D %M %Y') shippedDate
FROM    orders;

Select id,
date_format(shipped_date,'%W,%D,%M,%Y')
from orders
order by shipped_date;

-- YEAR()
SELECT YEAR('2002-01-01');
SELECT YEAR(shipped_date) as year,  COUNT(*) as orderQty
FROM    orders 
GROUP BY YEAR(shipped_date)
ORDER BY YEAR(shipped_date);

--  DAY()

SELECT DAY('2022-01-15');
SELECT  DAY(order_date) as dayofmonth, COUNT(*)
FROM    orders WHERE    YEAR(order_date) = 2004
GROUP BY dayofmonth
ORDER BY dayofmonth;















   



















