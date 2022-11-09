let a = parseInt(prompt('nhap gia tri a'));
let b = parseInt(prompt('nhap gia tri b'));
let c = parseInt(prompt('nhap gia tri c'));
let x1 = "";
let x2 = "";
let delta = b*b - 4*a*c;
if(delta<0){
    x1=x2=0;
    alert(0);
}else if(delta == 0){
    x1 = x2 = -b/(2*a);
    alert(1);
}else{
    delta = Math.sqrt(delta);
    x1 = (-b + delta) / (2*a);
    x2 = (-b - delta) / (2*a);
    alert(2);
}