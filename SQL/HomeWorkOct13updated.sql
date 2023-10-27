-- HOME WORK------------

-- QN:1 For each customer show the customer name, the total number of payments
select c.customer_name,count(*)
from customers c,payments p
where c.id=p.customer_id
group by c.id;

-- QN:2For each customer show the customer name and the total amount paid
select c.customer_name,sum(p.amount)
from customers c,payments p
where c.id=p.customer_id
group by c.id
ORDER BY c.customer_name;

-- QN:3  for each emoployee show the employee name and the total number of customers that employee has
select e.firstname,count(*)
from employees e,customers c
where e.id = c.sales_rep_employee_id
group by e.id
order by e.firstname;

SELECT CONCAT( e.firstname,' ',e.lastname) as 'EmployeeName', count(c.sales_rep_employee_id) 'Total Number of Customers'
FROM employees e
INNER JOIN customers c ON e.id=c.sales_rep_employee_id
GROUP BY e.id
ORDER BY EmployeeName;

-- QN4:for each office, show the office name, the total number of employees in that office, and the total number of customers

select o.address_line1,count(*) as tot_emplyee,count(*) as tot_cust
from offices o,employees e,customers c
where o.id=e.office_id
and e.id =c.sales_rep_employee_id
group by o.id,e.id;

-- QN:5 for each office, I want to see office name and the total number quantity of products ordered(Hard)

select o.address_line1,count(*) as num_of_products,sum(od1.quantity_ordered)
from offices o,employees e,customers c,orders od,orderdetails od1
where o.id = e.office_id
and e.id=c.sales_rep_employee_id
and c.id=od.customer_id
and od.id =od1.order_id
group by o.id
order by o.city;
select * from offices;

-- QN:6 for each office, I want to see the total profit for total quantity of all products ordered
select o.address_line1,count(*) as num_of_products
from offices o,employees e,customers c,orders od,orderdetails od1,products p
where o.id = e.office_id
and e.id=c.sales_rep_employee_id
and c.id=od.customer_id
and od.id =od1.order_id
and od1.product_id=p.id
group by o.id;

SELECT c.customer_name AS 'Customer Name',sum(p.amount) AS 'Total Number of Payments'
FROM customers c
INNER JOIN payments p on c.id=p.customer_id
GROUP BY c.id
ORDER BY c.customer_name;

SELECT os.city 'Office',sum(od.quantity_ordered) 'Total Number of Quanity of Products Ordered'
FROM offices os
INNER JOIN employees e ON os.id=e.office_id
INNER JOIN customers c ON e.id=c.sales_rep_employee_id
INNER JOIN orders o ON c.id=o.customer_id
INNER JOIN orderdetails od ON o.id=od.order_id
GROUP BY os.id
ORDER BY os.city;

select o.address_line1,count(*) as num_of_products
from offices o,employees e,customers c,orders od,orderdetails od1
where o.id = e.office_id
and e.id=c.sales_rep_employee_id
and c.id=od.customer_id
and od.id =od1.order_id
group by o.id
ORDER BY o.city;
SELECT os.city 'Office',sum(od.quantity_ordered) 'Total Number of Quanity of Products Ordered', sum(((p.msrp - p.buy_price) * od.quantity_ordered)) as 'Total Profit'
FROM offices os
INNER JOIN employees e ON os.id=e.office_id
INNER JOIN customers c ON e.id=c.sales_rep_employee_id
INNER JOIN orders o ON c.id=o.customer_id
INNER JOIN orderdetails od ON o.id=od.order_id
INNER JOIN products p ON p.id=od.product_id
GROUP BY os.id
ORDER BY os.city;

select o.address_line1,count(*) as num_of_products,sum(od1.quantity_ordered) as toal_quantity,sum(((p.msrp - p.buy_price) * od1.quantity_ordered)) as 'Total Profit'
from offices o,employees e,customers c,orders od,orderdetails od1,products p
where o.id = e.office_id
and e.id=c.sales_rep_employee_id
and c.id=od.customer_id
and od.id =od1.order_id
and od1.product_id=p.id
group by o.id
ORDER BY o.city;











