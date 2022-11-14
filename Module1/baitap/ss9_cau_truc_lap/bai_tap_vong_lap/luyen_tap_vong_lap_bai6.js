let count = 0, tong =0;
let dayso ="";
for (let i=1; ; i++){
    if(i%7==0){
        dayso += i+" " ;
        console.log(dayso);
        tong += i ;
        count++ ;
        if(count==30);
            break;
    }
}
document.write(dayso+"<br>")
document.write("Tổng bằng "+tong)