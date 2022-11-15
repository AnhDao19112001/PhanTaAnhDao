function trans(){
    let arr=['apple','pencil','computer','screen','display']
    let arr2=['Táo','Bút chì','Máy tính','Màn hình','Hiển thị']
    let arr3=document.getElementById('letter').value;
    let i=arr.indexOf(arr3)
    let result=''
    if (i!=-1) result=result+arr2[i];
    else result=''
    if (result!='') document.getElementById('tudien').innerHTML='Nghĩ là: '+result;
    else document.getElementById('tudien').innerHTML='Không tìm thấy'
}