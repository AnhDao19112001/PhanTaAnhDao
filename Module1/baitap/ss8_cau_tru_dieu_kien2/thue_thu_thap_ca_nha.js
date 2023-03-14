let Luong= +prompt('nhap so luong');
let thue_ca_nhan;
if (Luong>=15){
    thue_ca_nhan=Luong*30/100;
    alert('thue ca nhan la 30%,so tien thue la ' + thue_ca_nhan );
}else if(Luong>=7){
    thue_ca_nhan=Luong*20/100;
    alert('thue ca nha la 20%, so tien thue la ' + thue_ca_nhan);
}else {
    thue_ca_nhan=Luong*10/100;
    alert('thue ca nhan la 10%, so tien thue la ' + thue_ca_nhan);
}

// 30% thuế thu nhập nếu lương là 15 triệu
// 20% thuế thu nhập nếu lương từ 7 đến 15 triệu
// 10% thuế thu nhập nếu lương dưới 7 triệu