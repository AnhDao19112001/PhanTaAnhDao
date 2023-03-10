drop database if exists chuyen_doi_erq;

create database chuyen_doi_erq;

use chuyen_doi_erq;

create table phieu_xuat(
so_px int primary key,
ngay_xuat date not null
);
create table vat_tu(
ma_vt int primary key,
ten_vt varchar(255) not null
);
create table phieu_nhap(
so_pn int primary key,
ngay_nhap date not null
);
create table nha_cc(
ma_ncc int primary key,
ten_ncc varchar(255),
dia_chi varchar(255)
);
create table sdt_ncc(
sdt varchar(10) primary key,
ma_ncc int,
foreign key(ma_ncc) references nha_cc(ma_ncc)
);
create table don_dh(
so_hd int primary key,
ngay_dh date,
ma_ncc int,
foreign key(ma_ncc) references nha_cc(ma_ncc)
);
create table chi_tiet_phieu_xuat(
don_gia_xuat float,
so_luong_sx int,
so_px int,
ma_vt int,
primary key(so_px, ma_vt),
foreign key(so_px) references phieu_xuat(so_px),
foreign key(ma_vt) references vat_tu(ma_vt)
);
create table chi_tiet_phieu_nhap(
don_gia_nhap float,
so_luong_nhap int,
ma_vt int,
so_pn int,
primary key(ma_vt, so_pn),
foreign key(ma_vt) references vat_tu(ma_vt),
foreign key(so_pn) references phieu_nhap(so_pn)
);
create table chi_tiet_don_dat_hang(
ma_vt int,
so_hd int,
primary key(ma_vt, so_hd),
foreign key(ma_vt) references vat_tu(ma_vt),
foreign key(so_hd) references don_dh(so_hd)
);
