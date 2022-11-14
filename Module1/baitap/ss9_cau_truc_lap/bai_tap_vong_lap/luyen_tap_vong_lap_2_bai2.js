// let i , n, fact =1;
// let cout = prompt('nhap mot so ');
//
// for(let i=1; i <= n; i++){
//     fact=fact*i;
// }

let a=+prompt('Nhập 1 số nguyên dương')
let b=1;
for (let i=1; i<=a; i++){
    b=b*i;
}
document.getElementById('bai2').innerHTML=b;