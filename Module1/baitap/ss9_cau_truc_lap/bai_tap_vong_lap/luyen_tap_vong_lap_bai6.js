
// let tong =0;
// let dayso ="";
// for (let i=1; i<=30 ; i++){
//     if(i%7==0){
//         dayso += i+" " ;
//         console.log(dayso);
//         tong += i ;
//     }
// }
// document.write(dayso+"<br>")
// document.write("Tổng bằng "+tong)

let tong = 0;
let i = 0;
let count = 0;
while (i >= 0 && count < 30) {
    if (i % 7 === 0) {
        tong = tong + i;
        count++;
        document.write(i + "<br>");
    }
    i += 1;
}
document.write("Tổng = " + tong);
