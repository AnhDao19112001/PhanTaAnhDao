let a;
let b;
let c;

a = +prompt('bai kiem tra ');
b = +prompt('kiem tra giua ky');
c = +prompt('kiem tra cuoi ky');

a = parseInt(a);
b = parseInt(b);
c = parseInt(c);

 if(result= ((a + b*2 +c*3) / 6) >= 8){
     document.write('hoc sinh gioi');
 }else if(result= ((a + b*2 + c*3) / 6) >= 5){
     document.write('hoc sinh trung binh');
 }else if(result= ((a + b*2 + c*3) / 6) <= 5){
     document.write('hoc sinh yeu');
 }
//document.getElementById('bai5').innerHTML=result;
