let a = +prompt('nhap nghiem a');
let b = +prompt('nhap nghiem b');
//let checkA = a!=0 && b!=0;
//alert(checkA);
let x=(-b)/a;
if (a==0){
    if(b==0){
        alert('phuong trinh co vo so nghiem')
    }else {
        alert('phuong trinh vo nghiem')
    }
}else{
    alert('phuong trinh co nghiem la : ' + x)
}
