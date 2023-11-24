drop database if exists sieu_thi;
create database sieu_thi;
use sieu_thi;

create table thuc_pham (
id int primary key auto_increment,
name varchar(50) not null,
NSX int not null,
HSD int not null,
id_ltp int not null,
foreign key (id_ltp) references loai_thuc_pham(id_ltp),
mo_ta varchar(500)
);

create table loai_thuc_pham (
id_ltp int primary key auto_increment,
name_ltp varchar(50)
);

insert into loai_thuc_pham values 
(1,'hàng đông lạnh'),
(2,'hàng tươi sống'),
(3,'hàng đã qua chế biến');

insert into thuc_pham values
(1,'Thịt đông lạnh',2022/12/12,2023/04/12,1,null),
(2,'Ca thu',2023/01/30,2023/02/02,2,null),
(3,'Bánh bao hấp',2023/01/30,2023/02/25,3,'Hấp lại trong vòng 5 phút'),
(4,'Rau xà lách',2023/02/01,2023/04/02,2,null);

insert into thuc_pham values (?,?,?,?,?,?);
