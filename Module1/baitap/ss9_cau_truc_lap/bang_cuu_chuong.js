let sout, i, j;
sout = "<table border='1' width='200' cellspacing='0' cellpadding='15'>";
debugger;
for (i = 1; i <= 10; i++) {
    sout = sout + "<tr>";
    for (j = 1; j <= 10; j++) {
        sout = sout + "<td>" + j + "*" + i + "=" + i * j + "</td>";
    }
    sout = sout + "</tr>";
    // j = 1;
}
sout = sout + "</table>";
document.write(sout);