use case_study_database;

-- task 11
select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
join hop_dong hd on hd.ma_hop_dong = hdct.ma_hop_dong
join khach_hang kh on kh.ma_khach_hang = hd.ma_khach_hang
join loai_khach lk on lk.ma_loai_khach = kh.ma_loai_khach
where lk.ten_loai_khach = 'Diamond' and (kh.dia_chi like "%Vinh" or kh.dia_chi like "%Quảng Ngãi");

-- task 12
select hd.ma_hop_dong, nv.ho_ten as ho_ten_nhan_vien, kh.ho_ten as ho_ten_khach_hang, kh.so_dien_thoai as sdt_khach_hang, dv.ten_dich_vu,
sum(ifnull(hdct.so_luong, 0)) as so_luong_dich_vu_di_kem, hd.tien_dac_coc
from hop_dong hd
left join nhan_vien nv on hd.ma_nhan_vien = nv.ma_nhan_vien
left join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
left join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
left join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
where (year(hd.ngay_lam_hop_dong) = 2020 and (month(hd.ngay_lam_hop_dong) in (10, 11, 12))) and hd.ma_hop_dong not in (
select hd.ma_hop_dong
from hop_dong hd
where year(hd.ngay_lam_hop_dong) = 2021 and (month(hd.ngay_lam_hop_dong) between 1 and 6))
group by hd.ma_hop_dong;

-- task 13
select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem, sum(hdct.so_luong) as so_luong_dich_vu_di_kem
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by ma_dich_vu_di_kem
having so_luong_dich_vu_di_kem = (
	select sum(hdct.so_luong) as sl
	from hop_dong_chi_tiet hdct
    group by ma_dich_vu_di_kem
    order by sl desc
    limit 1);
    
-- task 14
select hd.ma_hop_dong, ldv.ten_loai_dich_vu, dvdk.ten_dich_vu_di_kem, count(hdct.ma_dich_vu_di_kem) as so_lan_su_dung
from dich_vu dv
join loai_dich_vu ldv on ldv.ma_loai_dich_vu = dv.ma_loai_dich_vu
join hop_dong hd on hd.ma_dich_vu = dv.ma_dich_vu
join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by dvdk.ma_dich_vu_di_kem
having so_lan_su_dung = 1;

-- task 15
select nv.ma_nhan_vien, nv.ho_ten, td.ten_trinh_do, bp.ten_bo_phan, nv.so_dien_thoai, nv.dia_chi, count(hd.ma_nhan_vien) as so_hop_dong_tu_2020_den_2021
from nhan_vien nv
join trinh_do td on td.ma_trinh_do = nv.ma_trinh_do
join bo_phan bp on bp.ma_bo_phan = nv.ma_bo_phan
join hop_dong hd on hd.ma_nhan_vien = nv.ma_nhan_vien
group by ma_nhan_vien
having so_hop_dong_tu_2020_den_2021 <= 3;