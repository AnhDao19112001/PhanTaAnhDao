let F = 0 , F0= 0, F1=0, tong=0
let fibonacci = "";
for (let i=0; i<20;i++){
    if(i==0){
        F=1
        F1=1
        fibonacci += F+ " "
        tong +=F
    }else{
        F= F0+F1
        F0 = F1
        F1 = F
        fibonacci += F+ " "
        tong +=F
        console.log(i +" = "+F)
    }
}
document.write("Dãy Fibonacci là "+fibonacci+"<br>")
document.write("Tổng của các số = "+tong)