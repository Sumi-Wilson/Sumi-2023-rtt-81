select *  from customers;
select contact_firstname 
from customers order by contact_firstname  ;

select distinct contact_firstname from customers;
select distinct contact_firstname,contact_lastname
from customers
order by contact_firstname;
insert into customers (customer_name,contact_lastname,contact_firstname,phone,address_line1,address_line2,city,state,postal_code,country)
values('serial reminder','sumi','wilson','555-456-6789','address_line1','addrees_line2','denver','co','80876','usa');
select * from customers where contact_firstname='wilson';
update customers set address_line1="" where id='520';
select *
from customers
where country='Germany'
order by contact_firstname asc;

update customers set address_lin21="",address_line1='123 some street' where id =520;
select distinct country  from customers order by country desc;
select *from customers where customer_name like 'E%';
select distinct city from customers where city like'%-%' order by city desc;
delete from customers where customer_name ='Hibernate Customer' and id>498;
delete from customers where customer_name like '%4';
select * from customers where customer_name ='Hibernate Customer';

select p.product_name, od.quantity_ordered,p.id from products p,orderdetails od
where od.product_id=p.id
group by product_id
order by od.quantity_ordered desc;


-- what product appears in the most order
select p.product_name,count(*) as order_count
from orderdetails od,products p
where p.id=od.product_id
group by product_id
order by order_count desc;


-- what product has the highest quantity ordered
select p. product_name,sum(quantity_ordered)as total_ordered,count(*) as order_count
from products p,orderdetails od
where p.id = od.product_id
group by product_id
order by total_ordered desc;

-- show me the customer name and the total number of orders for that customer - useing count(*)
select c.customer_name,o.customer_id  ,count(*) as number_orders
from customers c,orders o
where c.id= o.customer_id
group by c.id
order by number_orders desc;

-- show me the custoemr name and the total number distint products ordered  - using count(*)

select c.id,c.customer_name,count(distinct product_id),count(product_id) as total_products
from customers c,orders o,orderdetails od
where c.id=o.customer_id
and o.id=od.order_id
group by c.id;

-- see all of the products that have been ordered by customer_id 141

select  p.product_name from
products p,orders o,customers c,orderdetails od
where c.id = o.customer_id
and o.id = od.order_id
and p.id=od.product_id
and c.id=141;


-- show me the customer name, the product name, and the total quantaity orderd of each product - using sum()
select  c.customer_name,p.product_name,sum(od.quantity_ordered)as total_quantity_ordered
from customers c,orders o,orderdetails od,products p
where c.id=o.customer_id
and o.id=od.order_id
and p.id =od.product_id
group by c.id, pid
order by customer_name asc;-- total_quantity_ordered desc;

-- show me the name of the product line and the number of products in each product line
select p1.product_line,count(p.id)
from products p,productlines p1
where p1.id=p.productline_id
group by p1.id;

















