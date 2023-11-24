drop database if exists computer_market;
CREATE database computer_market;
USE computer_market;
CREATE table user(
id_user int not null auto_increment,
name varchar(99) not null,
email varchar(99) not null,
password varchar(99) not null,
phone_number varchar(99) not null,
primary key (id_user)
);
INSERT INTO user(name, email, password, phone_number)
values('Nguyễn Văn A', 'hoanghaibk93@gmail.com','1234566565','0911899574'),
('admin', 'admin@gmail.com','admin','0911899574'),
('Nguyễn Văn D', 'hoanghaibk1@gmail.com','1234566565','0911899574'),
('Nguyễn Văn B', 'hoanghaibk2@gmail.com','1234566565','0911899574'),
('Nguyễn Văn C', 'hoanghaibk3@gmail.com','1234566565','0911899574'),
('Nguyễn Văn E', 'hoanghaibk4@gmail.com','1234566565','0911899574'),
('Nguyễn Văn F', 'hoanghaibk5@gmail.com','1234566565','0911899574'),
('Nguyễn Văn D', 'hoanghaibk6@gmail.com','1234566565','0911899574'),
('Nguyễn Văn B', 'hoanghaibk7@gmail.com','1234566565','0911899574'),
('Nguyễn Văn C', 'hoanghaibk8@gmail.com','1234566565','0911899574'),
('Nguyễn Văn E', 'hoanghaibk9@gmail.com','1234566565','0911899574'),
('Nguyễn Văn F', 'hoanghaibk10@gmail.com','1234566565','0911899574');
create table pc(
id_pc int primary key auto_increment,
name_pc varchar(255) not null,
price_pc varchar(255) not null,
producer_pc varchar(255) not null,
country_pc varchar(255) not null,
describe_pc varchar(255) not null,
img_pc varchar(1000) not null,
id_user int not null,
foreign key (id_user) references user(id_user)
);
insert into pc (name_pc, price_pc, producer_pc, country_pc, describe_pc, img_pc, id_user)
value ('Apple MacBook Air M1 2020 8GB/256GB/7-core GPU (MGND3SA/A)','15.000.000','Apple','VN','like new','https://images.fpt.shop/unsafe/filters:quality(90)/fptshop.com.vn/uploads/images/tin-tuc/141394/Originals/MacBook-Pro-2020-face.jpg',1),
('Laptop Acer Aspire 3 A315 57 379K i3 1005G1/4GB/256GB/Win11 (NX.KAGSV.001)','15.000.000','Acer','VN','like new','https://cdn.tgdd.vn/Files/2016/11/16/914404/imac_800x450.jpg',1),
('Laptop Lenovo Ideapad 3 15IAU7 i3 1215U/8GB/256GB/Win11 (82RK005LVN)','10.000.000','Lenovo','VN','like new','https://i1-sohoa.vnecdn.net/2020/11/03/iPad-4215-1604376525.jpg?w=0&h=0&q=100&dpr=2&fit=crop&s=QGOT3LMuFxtS5v1f4tqDqw',4),
('Laptop Lenovo Ideapad 5 Pro 14ITL6 i5 1155G7/8GB/512GB/Win11 (82L300M9VN)', '11.000.000','Lenovo','VN','like new','https://photo-cms-bizlive.epicdn.me/w1200/NSDN/macbookcnn20221220160159_90201.jpg',5),
('Laptop HP 240 G9 i5 1235U/8GB/512GB/Win11 (6L1Y2PA)','12.000.000','HP','VN','like new','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn76dHejpuhOddpw9PcRzUvePJXHJp-yVqeQ&usqp=CAU',2),
('Laptop HP Gaming VICTUS 15 fa0111TX i5 12500H/16GB/512GB/4GB RTX3050Ti/144Hz/Win11 (7C0R4PA)','15.000.000','HP','VN','like new','https://cdn.thesaigontimes.vn/wp-content/uploads/2022/06/ipad.jpg',2),
('Apple MacBook Air M1 2020 8GB/256GB/7-core GPU (MGND3SA/A)', '16.000.000','Apple','VN','like new','https://photo-cms-tpo.epicdn.me/w890/Uploaded/2023/qhj_hiobgobrfc/2020_09_26/phim_tat_tren_may_tinh_0_ANHP.jpg',3);
SELECT * FROM user;
SELECT * FROM pc;

INSERT INTO user(name, email, password)
value('Nguyen Van A', 'A@gmail.com','123456'),
('Nguyen Van A', 'D@gmail.com','1234567'),
('Nguyen Van A', 'B@gmail.com','12345678');
Select * From user where name = 'Nguyễn Văn E';
select pc.id_pc, pc.name_pc, pc.price_pc, pc.producer_pc, pc.country_pc, pc.describe_pc, pc.img_pc, user.name, user.phone_number from pc inner join user on pc.id_user = user.id_user;
select * from pc inner join user on pc.id_user = user.id_user;
insert into pc (name_pc, price_pc, producer_pc, country_pc, describe_pc, img_pc, id_user)
value ('Apple MacBook Air M1 2020 8GB/256GB/7-core GPU (MGND3SA/A)','15.000.000','Apple','VN','like new',
'https://images.fpt.shop/unsafe/filters:quality(90)/fptshop.com.vn/uploads/images/tin-tuc/141394/Originals/MacBook-Pro-2020-face.jpg',1);