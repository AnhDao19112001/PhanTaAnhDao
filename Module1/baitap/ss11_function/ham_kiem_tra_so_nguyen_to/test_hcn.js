var canvas = document.getElementById("DemoCanvas");
if (canvas.getContext)
{
    var ctx = canvas.getContext('2d');
    //ctx.fillStyle='#fa4b2a';    // color of fill
    ctx.fillRect(10, 40, 140, 160); // create rectangle
}