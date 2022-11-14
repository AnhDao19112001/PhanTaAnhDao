debugger;
//2 3 5 7 11
let count = 0;
for ( i= 1; i <= 40; i++) {
for (let i = 1; i <= number; i++) {
    if (number%i==0) {
        count++;
    }
}
if (count == 2) {
    count++
} else {
    document.write('No');
}
}
document.write(count)