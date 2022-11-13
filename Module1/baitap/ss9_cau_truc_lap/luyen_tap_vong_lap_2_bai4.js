// let m = +prompt('nhap chieu dai');
// let n = +prompt('nhap chieu rong');
//
// let i, j;
// for(i = 0; i<n; i++){
//     for(j = 0; j<m; j++){
//         if(i == 0 || i == n-1 || j == 0 || j == m-1){
//             alert("* ");
//         }else{
//             alert("  ");
//         }
//     }
//     alert(" ");
// }
let result='';
let i,j;
for (i=1;i<=7;i++){
    if (i==1||i==7) {
        for (j = 1; j <= 21; j++) {
            result = result + '*'
        }
        result=result+'<br>'
    } else{
        result=result+'*';
        for (j=1;j<=19;j++){
            result=result+'&ensp;';
        }
        result=result+'*'+'<br>';}
}
document.getElementById('bai4').innerHTML=result