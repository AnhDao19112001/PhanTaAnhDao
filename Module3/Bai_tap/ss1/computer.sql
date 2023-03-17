CREATE database computer_market;
USE computer_market;
CREATE table user(
id int not null auto_increment,
name varchar(99) not null,
email varchar(99) not null,
password varchar(99) not null,
primary key (id)
);

create table computer(
id_cp int not null auto_increment,
name varchar(99) not null,
price double not null,
producer varchar(99) not null,
country varchar(99) not null,
`describe` varchar(99) not null,
img varchar (99) not null,
primary key (id_cp),
foreign key (id) references user(id)
);



insert into computer(name,price,producer,country,`describe`,img)
values ('DELL', 10000, 'abc','VietNam','Hàng mới','img.1'),
('LENOVO', 10000, 'def','VietNam','Hàng mới','img.2'),
('ASUS', 10000, 'ghi','VietNam','Hàng mới','img.3'),
('ACER', 10000, 'klm','VietNam','Hàng mới','img.4'),
('MACBOOK', 10000, 'noq','VietNam','Hàng mới','img.5');
select*from computer;

INSERT INTO user(name, email, password)
value('Nguyễn Văn A', 'A@gmail.com','123456'),
('Nguyễn Văn D', 'D@gmail.com','1234567'),
('Nguyễn Văn B', 'B@gmail.com','12345678'),
('Nguyễn Văn E', 'E@gmail.com','123456789'),
('Nguyễn Văn F', 'F@gmail.com','12345678910'),
('Nguyễn Văn G', 'G@gmail.com','12345678911'),
('Nguyễn Văn D', 'D@gmail.com','1234567'),
('Nguyễn Văn B', 'B@gmail.com','12345678'),
('Nguyễn Văn E', 'E@gmail.com','123456789'),
('Nguyễn Văn F', 'F@gmail.com','12345678910'),
('Nguyễn Văn G', 'G@gmail.com','12345678911'),
('Nguyễn Văn D', 'D@gmail.com','1234567'),
('Nguyễn Văn B', 'B@gmail.com','12345678'),
('Nguyễn Văn E', 'E@gmail.com','123456789'),
('Nguyễn Văn F', 'F@gmail.com','12345678910'),
('Nguyễn Văn G', 'G@gmail.com','12345678911'),
('Nguyễn Văn D', 'D@gmail.com','1234567'),
('Nguyễn Văn B', 'B@gmail.com','12345678'),
('Nguyễn Văn E', 'E@gmail.com','123456789'),
('Nguyễn Văn F', 'F@gmail.com','12345678910'),
('Nguyễn Văn G', 'G@gmail.com','12345678911');
SELECT * FROM user