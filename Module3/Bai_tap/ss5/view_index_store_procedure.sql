drop database if exists demo;
create database demo;
use demo;
  
  create table products(
  id int primary key,
  product_code int,
  product_name varchar(45),
  product_price double,
  product_amount int,
  product_description text,
  product_status bit default 1
  );
  
  insert into products(id, product_code, product_name, product_price, product_amount, product_description, product_status)
  values (1,1,'Nhông xên đĩa', 450000, 10,'mới ken, không trầy sước',1),
  (2,2,'bánh cam titan', 2500000, 5,'Hàng mới nhập',1),
  (3,3,'phuộc ohlins', 25000000, 3,'Hàng mới nhập, 1 đã qua sử dụng',1),
  (4,4,'mâm cnc',2100000, 4, 'Hàng pass lại',1),
  (5,5,'lốp maxxis',1920000,2,'Còn tem',1);
  
alter table products add unique index i_product_code (product_code);
explain select * from products where product_code = 3;

alter table products add index i_produce_name_price (product_name, product_price);
explain select * from products where product_name = 'bánh cam titan' and product_price = 2800000;

create view w_products as
select product_code, product_name, product_price, product_status
from products;

update w_products set product_price = 470000 where product_name = 'Nhông xên đĩa';
select * from w_products;

drop view w_products;

delimiter $$
create procedure sp_get_info_products()
begin
    select * from products;
end $$
delimiter ;
call sp_get_info_products();
-- Tạo store procedure thêm một sản phẩm mới.
delimiter $$
create procedure sp_add_product (in p_id int, in p_code int, in p_name varchar(45), in p_price int, in p_amount int, in p_desciption text, in p_status bit)
begin
    insert into products values (p_id, p_code, p_name, p_price, p_amount, p_desciption, p_status);
end $$
delimiter ;
call sp_add_product(6, 6, 'Ốc salaya', 12000, 60, 'Rin ken', 1);
call sp_get_info_products();

delimiter $$
create procedure sp_set_produc_by_id (in id_set int, in product_name_update varchar(45))
begin
    update products set product_name = product_name_update where id = id_set;
end $$
delimiter ;
call sp_set_produc_by_id(6, 'Ốc salaya');
call sp_get_info_products();

delimiter $$
create procedure sp_remove_produc_by_id (in id_delete int)
begin
    delete from products where id = id_delete;
end $$
delimiter ;
call sp_remove_produc_by_id(6);
call sp_get_info_products();