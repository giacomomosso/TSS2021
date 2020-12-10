var numero1 = prompt("inserisci numero1");
var numero2 = prompt("inserisci numero2");

function near_100(x, y) {
    if (x != y)
    {
    x1 = Math.abs(x - 100);
    y1 = Math.abs(y - 100);
  
    if (x1 < y1)
    {
      return x;
    }
    if (y1 < x1)
    {
      return y;
    }
    return 0;
    }
    else
      return "entambi sono uguali";
  }

window.alert(near_100(numero1,numero2));