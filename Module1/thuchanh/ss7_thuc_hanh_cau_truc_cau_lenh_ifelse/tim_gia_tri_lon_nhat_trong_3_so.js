let a, b, c;

a = +prompt('nhap gia tri a');
b = +prompt('nhap gia tri b');
c = +prompt('nhap gia tri c');

a = parseInt(a);
b = parseInt(b);
c = parseInt(c);

if ( a > b >c ){
    document.write('a la gia tri lon nhat');
}else if (b > a > c){
    document.write('b la gia tri lon nhat')
}else{
    document.write('c la gia tri lon nhat')
}



