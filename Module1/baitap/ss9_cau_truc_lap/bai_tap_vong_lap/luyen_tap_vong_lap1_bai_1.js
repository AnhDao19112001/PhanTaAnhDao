let a='';
for(let i=1;i<=100;i++){
    a= a + i.toString()+' ';
    if(i==99){
        alert('da hoan thanh');
        break;
    }
}
document.getElementById('bai_1').innerHTML=a;

