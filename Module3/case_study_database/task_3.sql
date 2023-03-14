use case_study_database;

-- task 6
select dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, dich_vu.ten_dich_vu
from dich_vu
left join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
left join hop_dong on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
where hop_dong.ma_dich_vu not in (
select hop_dong.ma_dich_vu
from hop_dong
where (year(hop_dong.ngay_lam_hop_dong) = 2021) and (month(hop_dong.ngay_lam_hop_dong) in (1,2,3) ))
group by ma_dich_vu;

-- task 7
select dich_vu.ma_dich_vu, dich_vu.ten_dich_vu,	dich_vu.dien_tich, dich_vu.so_nguoi_toi_da, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu
join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
join hop_dong on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
where year(hop_dong.ngay_lam_hop_dong) = 2020 and hop_dong.ma_dich_vu not in (
select hop_dong.ma_dich_vu
from hop_dong
where year(hop_dong.ngay_lam_hop_dong) = 2021)
group by ma_dich_vu;

-- task 8 
select ho_ten
from khach_hang
group by ho_ten;

select distinct ho_ten
from khach_hang;

select ho_ten
from khach_hang
union 
select ho_ten
from khach_hang;

-- task 9
select month(ngay_lam_hop_dong) as thang, count(ma_khach_hang) as so_luong_khach_hang
from hop_dong
where year(ngay_lam_hop_dong) = 2021
group by thang
order by thang;

-- task 10
select hop_dong.ma_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.tien_dac_coc,
sum(ifnull(hop_dong_chi_tiet.so_luong, 0)) as so_luong_dich_vu_di_kem
from hop_dong
left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
group by ma_hop_dong;