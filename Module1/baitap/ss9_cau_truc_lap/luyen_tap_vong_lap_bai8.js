let phamvi = Number(prompt("Trò chơi đoán số từ 0 - "))
let nhapso = Number(prompt("Nhập vào số muốn đoán"))
let soRamdom
if(phamvi){
    soRamdom = Math.floor(Math.random()*phamvi)
    if(soRamdom == nhapso){
        alert("Bạn đã đoán đung")
    }else{
        while (soRamdom != nhapso){
            alert("Bạn đoán sai số đúng là "+soRamdom)
            nhapso = Number(prompt("Nhập vào số muốn đoán"))
        }
        alert("Bạn đoán đúng")
    }
}