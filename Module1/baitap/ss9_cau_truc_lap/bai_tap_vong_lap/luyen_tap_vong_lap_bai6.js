
let tong =0;
let dayso ="";
for (let i=1; i<=30 ; i++){
    if(i%7==0){
        dayso += i+" " ;
        console.log(dayso);
        tong += i ;
    }
}
document.write(dayso+"<br>")
document.write("Tổng bằng "+tong)