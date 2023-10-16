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
group by c.id;

-- QN:3  for each emoployee show the employee name and the total number of customers that employee has
select e.firstname,count(*)
from employees e,customers c
where e.id = c.sales_rep_employee_id
group by e.id;

-- QN4:for each office, show the office name, the total number of employees in that office, and the total number of customers

select o.address_line1,count(*) as tot_emplyee,count(*) as tot_cust
from offices o,employees e,customers c
where o.id=e.office_id
and e.id =c.sales_rep_employee_id
group by o.id,e.id;

-- QN:5 for each office, I want to see office name and the total number quantity of products ordered(Hard)

select o.address_line1,count(*) as num_of_products
from offices o,employees e,customers c,orders od,orderdetails od1
where o.id = e.office_id
and e.id=c.sales_rep_employee_id
and c.id=od.customer_id
and od.id =od1.order_id
group by o.id;
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












