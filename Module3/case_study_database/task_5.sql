use case_study_database;

-- task 16
-- update nhan_vien set is_delete = 1 where ma_nhan_vien in (
-- select nv.ma_nhan_vien
-- from (select ma_nhan_vien
-- from nhan_vien
	 -- where ma_nhan_vien not in (
	-- select ma_nhan_vien
	-- from hop_dong
	-- where year(ngay_lam_hop_dong) between 2019 and 2021)
 -- ) as nv
-- );
-- select *
-- from nhan_vien
-- where is_delete = 0;

-- cách khác  
delete from nhan_vien
WHERE
   ma_nhan_vien NOT IN (SELECT 
       ma_nhan_vien
   FROM
       hop_dong
   WHERE
       YEAR(ngay_lam_hop_dong) BETWEEN 2019 AND 2021);

-- task 17
update khach_hang set ma_loai_khach = 1 where ma_khach_hang in(
select ma_khach_hang
from ( select kh.ma_khach_hang, sum(ifnull(dv.chi_phi_thue,0) + ifnull(hdct.so_luong,0) * ifnull(dvdk.gia,0)) as tong_tien
	from khach_hang kh
    left join hop_dong hd on hd.ma_khach_hang = kh.ma_khach_hang
    left join dich_vu dv on dv.ma_dich_vu = hd.ma_dich_vu
    left join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
    left join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
    left join loai_khach lk on lk.ma_loai_khach = kh.ma_khach_hang
    where year(hd.ngay_lam_hop_dong) = 2021 and lk.ten_loai_khach = 'Platinium'
    group by ma_khach_hang
    having tong_tien > 10000000) as temp
);

-- task 18
update khach_hang set is_delete = 1 where ma_khach_hang in(
select ma_khach_hang 
from hop_dong
where year(ngay_lam_hop_dong) < 2021
);
select * from khach_hang where is_delete = 1;

-- task 19
update dich_vu_di_kem set gia = gia * 2 where ma_dich_vu_di_kem in(
select * 
from( select dvdk.ma_dich_vu_di_kem
		from dich_vu_di_kem dvdk
        join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
        join hop_dong hd on hd.ma_hop_dong = hdct.ma_hop_dong
        where year(hd.ngay_lam_hop_dong) = 2020
        group by ma_dich_vu_di_kem
        having sum(hdct.so_luong) > 10) as temp
);
select * from dich_vu_di_kem;

-- task 20
select ma_khach_hang as id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi, is_delete
from khach_hang
union
select ma_khach_hang as id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi, is_delete
from khach_hang;