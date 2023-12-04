-- Homework oct 16
select max(payment_date)from payments;
-- QN1:want to see a list of customer names and the order number for any orders that have made an order that has an order_date greater than the latest payment date -
-- doubt dont work with >
select c.customer_name ,o.id from customers c,orders o
where order_date < (select max(payment_date)from payments); 
select c.customer_name, o.customer_id, o.order_date
	from customers c
	join orders o ON c.id = o.customer_id
	where o.order_date > (
		select MAX(payment_date)
		from payments p
		where p.customer_id = c.id
	);
select c.customer_name,o.id from customers c,orders o where c.id=o.customer_id 
 and o.order_date>(select max(p.payment_date) from payments p where p.customer_id=o.customer_id);

select id from offices where state is   not null;

-- QN2:  I want to see all the employees that are working in an office where the state is not null;
select concat(firstname, ' ',lastname)
from employees 
where employees.office_id
in(select id from offices where state is not null)
order by firstname;
-- by jancy
select e.firstname, e.lastname 
from classic_models.employees e, classic_models.offices o
where e.office_id = o.id
and state is not null;
 
 -- by  getu
 select e.id, e.firstname, e.lastname, e.office_id, o.state
	from employees e 
	join offices o on e.office_id = o.id
	where o.state is not null;
    select firstname from employees e,offices o
    where e.office_id = o.id 
    and o.state is not null;

select * from productlines;
select id from  productlines p where p.product_line='Planes' or p.product_line='Ships' or p.product_line='Trains';


-- QN:3  I want to all of the products that are not ground vehicles.   Hint -  where not in a select statement from product line
select product_name ,productline_id
from products 
where productline_id 
in(select id from  productlines p where p.product_line='Planes' or p.product_line='Ships' students);

-- enhancing the query
select product_name,product_line
 from products p,productlines pl
where p.productline_id = pl.id
and( pl.product_line='Planes' or pl.product_line='ships' or  pl.product_line='Trains') 
  order by product_name;
 
 select * from productlines;


-- QN:3a I want to see a unique list of the order status
select distinct status from orders;


-- QN:4  use an IN statement with a sub query - I want to see the list of products that have been ordered but not yet shipped. 
-- the orders table has a status column that contins the order status
-- i dont know how to connect order and products so geting quantity orderd from orderdetails
select product_id 
from orderdetails 
where order_id 
in(select id from orders where status != 'shipped');
select id from orders where status != 'shipped';
-- enhancing and correcting

select product_name from products p,orderdetails od1
where p.id = od1.product_id
and od1.order_id in 
(select od.id from orderdetails od,orders o
where( od.order_id= o.id
and o.status != 'shipped'));

-- QN: 5 The product name, and quantity ordered for all orders that are on holed or in process
-- i dont know how to get product name from products ask doubt

select quantity_ordered,product_id 
from orderdetails 
where order_id 
in (select id from orders where status = 'on hold' or status = 'in process');

-- QN:6  I want to see a list of all employess that do not have a customer!!!!  use a where not in ( select employee_id from customer where .... )
-- doubt doesnt work with not in
select firstname from employees where employees.id   in (select distinct sales_rep_employee_id from customers);
select distinct sales_rep_employee_id from customers;

-- QN 6a   I want to see the employee name and each of their customer names.   IF the employee does not have any customers then show null for the customer name 
-- ... this is a left join
--    order this by the employee first name asc    you will see the employee name repeated many times for each customer they have
 -- but if the employee has no customers it should print NULL in
--    the second column.
select e.firstname,c.customer_name
from employees e
left join
customers c
on e.id = c.sales_rep_employee_id
order by e.id;











