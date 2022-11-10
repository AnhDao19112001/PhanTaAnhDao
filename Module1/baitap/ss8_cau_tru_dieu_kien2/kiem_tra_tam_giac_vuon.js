let a = +parseInt((prompt('nhap canh a')));
let b = +parseInt((prompt('nhap canh b')));
let c = +parseInt((prompt('nhap canh c')));
let p = "";
let s=0;
if((a*a<b*b+c*c) && (b*b<a*a+c*c) && (c*c<b*b+a*a)){
    alert('day la 3 canh cua tam giac');
    p = (a+b+c)/2;
    s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    alert('dien tich cua tam giac la:' + s );
}else{
    alert('day khong phai la 3 canh ua tam giac');
}
