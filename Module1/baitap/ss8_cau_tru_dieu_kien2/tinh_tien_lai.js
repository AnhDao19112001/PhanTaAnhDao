let soTienVay = +prompt("Nhập số tiền bạn muốn vay?");
let soThangVay = +prompt("Nhập thời gian bạn vay (tháng)");
let phanTramLaiXuat = +prompt("Nhập lãi xuất(%)");
let laiXuatHangThang = (soTienVay * phanTramLaiXuat / 100) / soThangVay;
document.write("Lãi xuất hằng tháng bạn phải trả là: " + laiXuatHangThang + "VND");
