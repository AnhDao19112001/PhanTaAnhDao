
let a =[65,32,2,5,8,85,54,12,16,9]
let max=0

for ( i = 0; i <a.length ; i++) {
    if(a[i]>max){
        max=a[i]
    }
}alert('phần tử có giá trị lớn nhất trong mảng là '+max+' tại vị trí thứ '+a.indexOf(max))

