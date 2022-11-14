function checkNT(number) {
    let count = 0; // đếm số ước của số đang xét;
    let countSNT = 0; // đếm xem đã đủ số lượng số nguyên tố cần in ra chưa;
    for (let i = 2; i < 1000; i++) { // 2,3,4,5,6,7,8,....,1000
        if (countSNT < number) { // Nếu số lượng SNT in ra < so với số lượng yêu cầu
            for (let j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                document.write(i + "<br>"); //4
                countSNT += 1; //1
            }
            count = 0;
        } else {
            break;
        }
    }
}
let number = parseInt(prompt("Nhập n số nguyên tố đầu tiên: ")); //10
checkNT(number);
