let banhang = parseInt(prompt('nhap doanh so ban hang (D)'));
let a = banhang * 5 / 100;
let b = banhang * 10 / 100;
let c = banhang * 20 / 100;
if( banhang < 100){
    alert('ban khong nhan duoc hoa hong');
}else if( banhang >= 100 && banhang <500 ){
    alert('ban nhan duoc hoa hong' +a);
}else if( banhang >=500 && banhang <1500 ){
    alert('ban nhan duoc hoa hong' +b);
}else alert('ban nhan duoc hoa hong' +c)



