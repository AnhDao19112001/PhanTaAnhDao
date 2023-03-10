drop database if exists student;
 
create database student;

use student;

create table student_class(
id int primary key,
name varchar(255)
);

insert into student_class(id, name)
value (1, 'c1122g1'),
(2, 'c1122g1'),
(3, 'c1122g1'),
(4, 'c1122g1');

select * from student_class;

create table teacher(
id int primary key,
name varchar(255) not null,
age int,
country varchar(255) not null
);

insert into teacher(id, name, age, country)
value (1, 'Hai', 24, 'QN'),
(2, 'TrungDC', 27, 'QN'),
(3, 'Cong', 30, 'QN');

select * from teacher;
