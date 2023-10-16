SELECT    id, order_line_number, quantity_ordered * price_each as toal_amt
FROM    orderdetails
ORDER BY   quantity_ordered * price_each DESC;

SELECT    firstname, lastname, reports_to
FROM    employees
ORDER BY reports_to;

-- Display the name, product line, and buy price of all products.
-- The output columns should display as: “Name,” “Product Line,” and “Buy Price.” The output should display the most expensive items first. 

select p.product_name as Name,pl.product_line as ProductLine,p.buy_price as Buy_Price
from products p,productlines pl
where pl.id=productline_id
order by Buy_Price desc;

-- Display the first name, last name, and city name of all customers from Germany.
--  The output columns should display as: “First Name,” “Last Name,” and “City.” The output should be sorted by “Last Name” (ascending).
select * from customers limit 5;

select contact_firstname as FirstName,contact_lastname as Lastname, city as City
from customers
where country ='Germany'
order by contact_lastname ;

-- Display each of the unique values of the status field in the orders table. The output should be sorted alphabetically, ascending.
-- Hint: The output should show exactly six rows.

select distinct status from orders
order by status ;

-- Display all fields from the payments table for payments made on or after January 1, 2005. 
-- The output should be sorted by the payment date from highest to lowest.
select * from payments limit 5;
select * from payments
where payment_date>='2005-01-01';

-- Display the last Name, first Name, email address, and job title of all employees working out of the San Francisco office. 
-- The output should be sorted by “Last Name.”


select lastname,firstname,email,reports_to,job_title
from employees
where office_id='1'
order by lastname ;


-- Display the name, product line, scale, and vendor of all of the car products – both classic and vintage.
-- The output should display all vintage cars first (sorted alphabetically by name), and all classic cars last (also sorted alphabetically by name). 
select * from productlines;
select p.product_name,pl.product_line,p.product_scale,p.product_vendor
from products p,productlines pl
where pl.product_line='Classic Cars'
or pl.product_line='Vintage Cars';









