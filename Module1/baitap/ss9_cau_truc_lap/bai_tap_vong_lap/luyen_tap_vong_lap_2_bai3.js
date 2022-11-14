let i,j;
let k=5;
let r=1;
let result='';
for (i=1;i<=5;i++){
    for (j=1;j<=i;j++){
        result=result+ '*'
    }
    result=result+'<br>'
}
result=result+'<br>';
for (i=5;i>=1;i--){
    for (j=1;j<=i;j++){
        result=result+ '*'
    }
    result=result+'<br>'
}
result=result+'<br>';
for (i=1;i<=5;i++) {
    for (j = 1; j <= k; j++) {
        result=result+ '&ensp;'
        if (k<0) break;
    }
    k=k-1;
    for (j = 1; j <= i; j++) {
        result=result+'*'
    }
    result=result+'<br>'
}
result=result+'<br>';
for (i=5;i>=1;i--){
    for (j = 1; j <= r; j++) {
        result=result+ '&ensp;'
        if (r>5) break;
    }
    r=r+1;
    for (j=1;j<=i;j++){
        result=result+ '*'
    }
    result=result+'<br>'
}
document.getElementById('bai3').innerHTML=result;