# Write your MySQL query statement below
Select c.name as Customers
from customers c
where id not in (select customerId from orders);