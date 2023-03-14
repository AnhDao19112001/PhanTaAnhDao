let sout, i, j;
sout = "<table border='1' width='200' cellspacing='0' cellpadding='15'>";
debugger;
for (i = 2; i <= 9; i++) {
    sout = sout + "<tr>";
    for (j = 2; j <= 9; j++) {
        sout = sout + "<td>" + j + "*" + i + "=" + i * j + "</td>";
    }
    sout = sout + "</tr>";
    // j = 1;
}
sout = sout + "</table>";
document.write(sout);