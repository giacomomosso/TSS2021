
function creaAuto(marca,modello,colore,annoImmatricolazione) {
    this.marca = marca,
    this.modello = modello,
    this.colore = colore,
    this.annoImmatricolazione = annoImmatricolazione,
    this.prezzo = NaN,
    this.SetPrezzo = function(prezzo){
        this.prezzo = prezzo;
     };
}



let HBREJ3 = new creaAuto("Fiat","panda","rosso",1998);
console.log(HBREJ3);
HBREJ3.SetPrezzo(2300);
console.log(HBREJ3);
document.getElementById("app").innerHTML = JSON.stringify(HBREJ3);