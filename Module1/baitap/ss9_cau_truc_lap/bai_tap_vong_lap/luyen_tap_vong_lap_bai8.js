// let phamvi = Number(prompt("Trò chơi đoán số từ 0 - "))
// let nhapso = Number(prompt("Nhập vào số muốn đoán"))
// let soRamdom
// if(phamvi){
//     soRamdom = Math.floor(Math.random()*phamvi)
//     if(soRamdom == nhapso){
//         alert("Bạn đã đoán đung")
//     }else{
//         while (soRamdom != nhapso){
//             alert("Bạn đoán sai số đúng là "+soRamdom)
//             nhapso = Number(prompt("Nhập vào số muốn đoán"))
//         }
//         alert("Bạn đoán đúng")
//     }
// }


    function doanso() {
        let min =  +prompt("Nhập giá trị min: ");
        let max =  +prompt("Nhập giá trị max");
        for (a = 1; a <= 3; a++) {
            let y = +prompt("đoán số: ");
            let x = Math.floor(Math.random() * max) + min;
            if (x == y) {
                alert("Chúc mừng");
                break;
            } else {
                if (y > x) {
                    alert("Lớn hơn")
                } else {
                    alert("Nhỏ hơn")
                }
            }
        }
    }
