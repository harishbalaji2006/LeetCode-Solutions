# Write your MySQL query statement below
Select name as Customers From Customers Left Join Orders ON Customers.id=Orders.customerId WHERE Orders.customerId IS NULL; 