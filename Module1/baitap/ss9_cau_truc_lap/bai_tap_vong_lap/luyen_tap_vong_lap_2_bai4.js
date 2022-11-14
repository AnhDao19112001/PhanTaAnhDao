// let m = +prompt('nhap chieu dai');
// let n = +prompt('nhap chieu rong');
//
// let i, j;
// for(i = 1; i<=n; i++){
//     for(j = 1; j<=m; j++){
//         if(i == 1 || i == n || j == 1 || j == m){
//             document.write("*");
//         }else{
//             document.write("&nbsp&nbsp");
//         }
//     }
//     document.write('<br>')

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