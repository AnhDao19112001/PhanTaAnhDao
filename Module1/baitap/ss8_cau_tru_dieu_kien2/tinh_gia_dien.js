let soDien = parseInt(prompt("nhap vao so dien (kWh): "));
let tienDien;
// let thang1 = 1678;
// let thang2 = 1734;
// let thang3 = 1734;
// let thang4 = 1734;
// let thang5 = 1734;
// let thang6 = 1734;
// if(soDien<0){
//     alert('\nvui long nhap lai so dien\nSo dien khong duoc nho hon 0\n ');
// }else if(soDien<=50){
//     tienDien=soDien*thang1;
//     alert("\nban da dung dien trong khoang 0 - 50 kWh so tien ban phai dong la: " + tienDien);
// }else if(soDien<=100){
//     tienDien=50*thang1+((soDien-50)*thang2);
//     alert("\nban da su dung dien trong khoang 51 - 100 kWh so tien ban phai dong la: " + tienDien);
// }else if(soDien<=200){
//     tienDien=50*thang1+(50*thang2)+((soDien-100)*thang3);
//     alert("\nban da dung so dien trong khoang 101 - 200 kWh so tien ban phai dong la: " + tienDien);
// }else if(soDien<=300) {
//     tienDien = 50 * thang1 + (50 * thang2) + (50 * thang3) +((soDien - 200) * thang4);
//     alert("\nban da dung so dien trong khoang 201 - 300 kWh so tien ban phai dong la: " + tienDien);
// }else if(soDien<=400) {
//     tienDien = 50 * thang1 + (50 * thang2) + (50 * thang3) + (50 * thang4) + ((soDien - 300) * thang5);
//     alert("\nban da dung so dien trong khoang 301 - 400 kWh so tien ban phai dong la: " + tienDien);
// }else if(soDien>400){
//     tienDien= 50 * thang1 + (50 * thang2) + (50 * thang3) + (50 * thang4) + (50 * thang5) + ((soDien - 400) * thang6);
//     alert("\nban da dung so dien trong khoang 401 - 500 kWh so tien ban phai dong la: " + tienDien);
// }
if(soDien>=401){
    tienDien= soDien*2907;
    alert('hien thi tien dien' + tienDien)
}else if(soDien>=301){
     tienDien= soDien*2834;
     alert('hien thi tien dien' + tienDien);
}else if(soDien>=201){
    tienDien=soDien*2536;
    alert('hien thi tien dien' + tienDien);
}else if(soDien>=101){
    tienDien=soDien*2014;
    alert('hien thi tien dien' + tienDien);
}else if(soDien>=51) {
    tienDien = soDien *1734;
    alert('hien thi tien dien' + tienDien);
}else {
    tienDien=soDien*1678;
    alert('hien thi tien dien' + tienDien);
}