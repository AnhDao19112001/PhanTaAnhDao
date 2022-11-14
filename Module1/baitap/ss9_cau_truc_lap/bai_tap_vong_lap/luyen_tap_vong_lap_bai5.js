// let F = 0 , F0= 0, F1=0, tong=0
// let fibonacci = "";
// for (let i=0; i<20;i++){
//     if(i==0){
//         F=1
//         F1=1
//         fibonacci += F+ " "
//         tong +=F
//     }else{
//         F= F0+F1
//         F0 = F1
//         F1 = F
//         fibonacci += F+ " "
//         tong +=F
//         console.log(i +" = "+F)
//     }
// }
// document.write("Dãy Fibonacci là "+fibonacci+"<br>")
// document.write("Tổng của các số = "+tong)

// let a1 = 0, a2 =0, a3 =0, tong=0;
// let  fibonacci = " ";
// for (let i=0; i<20; i++){
//     if(i==0){
//         a1=a2+a3;
//         a2=a3;
//         a3=a;
//         fibonacci += a1+ " ";
//         tong +=a1;
//         alert(i + " = "+a1);
//     }
// }
// document.write("day fibonacci la "+fibonacci);
// document.write("tong cua cac so fibonacci = " +tong);

let a = 0
let b = 1
let c = a + b
let result = '0 1 1';
let tong = 2;
count = 0;
while (count < 17) {
    a = b
    b = c
    c = a + b
    result = result + c + '<br> '
    count++;
    tong = tong + c
}
document.write(result)
document.write("tong la " +tong)
