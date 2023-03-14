drop database if exists quan_li_sinh_vien;
create database quan_li_sinh_vien;
use quan_li_sinh_vien;
create table class(
class_id int primary key,
class_name varchar(60) not null,
start_date datetime not null,
`status` bit
);

create table student(
student_id int,
student_name varchar(30) not null,
address varchar(50),
phone varchar(20),
`status` bit,
class_id int,
primary key(student_id, `status`,class_id),
foreign key (class_id) references class(class_id)
);

create table `subject`(
subject_id int primary key auto_increment,
subject_name varchar(30) not null,
credit int,
`status` bit
);

create table mark(
mark_id int primary key,
mark int,
exam_times int,
student_id int,
subject_id int,
foreign key (student_id) references student(student_id),
foreign key (subject_id) references `subject`(subject_id)
);

insert into class(class_id,class_name,start_date,`status`)
values (1,'c1122g1','2022-12-01',1),
(2,'c0123g1','2023-01-01',1),
(3,'c1022g1','2022-10-28',1);


insert into student(student_id,student_name,address,phone,`status`,class_id)
values (1,'Anh Đào','Ái Nghĩa, Đại Lộc, Quảng Nam', 0931997293,1,1),
(2,'Huấn Hoa Hồng','Phu Ninh, Quảng Nam',123456789,1,3),
(3, 'Hung','Da Nang',987654321,1,3);

insert into `subject`(subject_id,subject_name,credit,`status`)
values (1,'bla bla',1,1),
(2,'dark dark',5,1),
(3,'burh burh',3,1),
(4,'lmao lmao',10,1);

insert into mark(mark_id,mark,exam_times,student_id,subject_id)
values (1,1,1,1,1);