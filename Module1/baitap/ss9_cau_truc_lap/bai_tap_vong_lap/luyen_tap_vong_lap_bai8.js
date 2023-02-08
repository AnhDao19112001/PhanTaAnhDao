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
// function doThis() {
//     let n = +prompt('Bạn muốn dự đoán giới hạn bao nhiêu: ');
//     let e=Math.floor(Math.random()*n);
//     for (let i=1;i<=3; i++){
//         let k=+prompt('Bạn dự đoán số: ')
//         if (e== k) {
//             alert('Bạn dự đoán đúng. Chúc mừng')
//             break;
//         } else if (i<3) {
//             if (k <e) alert('Số cần tìm lớn hơn. Mời dự đoán lại');
//             else if (k>e) alert('Số cần tìm nhỏ hơn. Mời dự đoán lại');
//         } else if (i>=3) alert('Bạn đã hết lượt');
//     }
// }
