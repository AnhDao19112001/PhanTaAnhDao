use quan_li_ban_hang;
select id_order,`date`,total_price
from `order`;

select c.id_customer, c.`name`, c.age, p.`name`
from customer c
join `order` o on c.id_customer = o.id_customer
join order_deltail od on o.id_order = od.id_order
join product p on od.id_product = p.id_product;

select c.`name`
from customer c
where c.id_customer not in(
select c.id_customer
from customer c
join `order` o on c.id_customer = o.id_customer
join order_deltail od on o.id_order = od.id_order
join product p on od.id_product = p.id_product
);

select o.id_order, o.`date`, sum(od.quantity * p.price) as total_price
from `order` o
join order_deltail od on o.id_order = od.id_order
join product p on od.id_product = p.id_product
group by o.id_order;