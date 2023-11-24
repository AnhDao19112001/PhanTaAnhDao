drop database if exists word;
create database word;
use word;

create table trang_thai(
                           id_tt int primary key auto_increment not null,
                           ten_tt varchar(255) not null
);
insert into trang_thai
values(1, 'Chưa làm'),
      (2, 'Đang làm'),
      (3, 'Đã xong');
select * from trang_thai;

create table cong_viec(
                          id int primary key auto_increment not null,
                          ten_cv varchar(255) not null,
                          NTH varchar(50) not null,
                          NKT varchar(50) not null,
                          id_tt int not null,
                          foreign key(id_tt) references trang_thai(id_tt),
                          mo_ta varchar(500) not null
);
insert into cong_viec
values(1, 'Daily meeting', '17/11/2023','17/11/2023',1,'N/A'),
      (2, 'Meeting với khách hàng Nhật', '17/11/2023', '18/01/2023',1,'tầm 10 giờ sáng'),
      (3, 'Log QA về màn hình thêm nhân viên', '22/01/2023', '22/01/2023',3,'button Clear không cần thiết'),
      (4, 'Tạo HTML màn hình thêm mới NV', '16/01/2023', '17/01/2023',2,'N/A'),
      (5, 'Viết query màn hình thêm mới NV', '17/01/2023', '18/01/2023',1,'N/A');
select * from cong_viec;

select * from cong_viec join trang_thai th on th.id_tt = cong_viec.id_tt order by cong_viec.id_tt;