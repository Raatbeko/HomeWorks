select * from customer c 
where c.country = 'Canada';

select country from customer c ;

select count(id) from orders o;

select max(unit_price) from order_item oi;

select sum(total_amount) from orders o ;
 
select sum(total_amount) from orders o 
where order_date = '2014-01-01';

select avg(total_amount) from orders o ;

select * from customer c 
where country = 'Brazil' or country = 'Spain';

select * from orders o 
where order_date > '2013-01-01' and order_date < '2014-01-01' and  total_amount > '100';

select * from customer c 
where c.country = 'Italia' or c.country = 'Spain' or c.country = 'Germany' or c.country = 'France'
order by c.country ;

select c.country from customer c 
join supplier s on s.country  = c.country 
group by c.country;

select * from customer c 
where c.first_name like 'Jo%';

select * from customer c 
where c.first_name like '___a';

select c.country ,count(country)from customer c
group by c.country ;

select c.country ,count(country) as count_country from customer c
group by c.country 
order by count_country desc;

select sum(o.total_amount),count(o.customer_id),c.id,c.first_name ,c.last_name
from orders o 
join customer c on o.customer_id = c.id 
group by c.id  ,c.first_name ,c.last_name;

select sum(o.total_amount),count(o.customer_id),c.id,c.first_name ,c.last_name
from orders o 
join customer c on o.customer_id = c.id 
group by c.id  ,c.first_name ,c.last_name;
having count(o.customer_id)>20
order by c.id;

select count(city),country
from customer c 
order by c.country ;

select oi.order_id,c.first_name ,c.last_name ,c.city ,p.product_name, p.unit_price ,s.contact_name
from customer c
join orders o on o.customer_id = c.id 
join order_item oi on oi.order_id = o.id 
join product p on p.id = oi.product_id 
join supplier s on s.id = p.supplier_id 
where oi.id = 5;

