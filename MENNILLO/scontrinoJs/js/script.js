console.log("scriptjs is online");

// dichiarazione const
const nomeNegozio = "trattoria da gianni s.r.l";
const salutoCliente = "solo da noi la bagnacauda piccante";
const iva = 1.22;
const saluto = "Grazie ed arrivederci";

// dichiarazione variabili 

let carrello = [];
function item() {
    this.nome;
    this.costoItem;
    this.costoSpedizioneItem;
    this.quantita
}

let totaleArticoli = 0;
let costoSpedizione = 5; //costo fisso spedizione
let totale = 0 ;

//data generation
let obj4554 = new item();
obj4554.nome="dentifricio";
obj4554.costoItem=34;
obj4554.costoSpedizioneItem=2.1
obj4554.quantita=3;
carrello.push(obj4554);
let obj4555 = new item();
obj4555.nome="spazzolino";
obj4555.costoItem=4;
obj4555.costoSpedizioneItem=0.8
obj4555.quantita=1;
carrello.push(obj4555);
console.log(carrello);

totaleArticoli = carrello.length;
carrello.forEach(x => {
    totaleArticoli += x.quantita;
    costoSpedizione += x.costoSpedizioneItem*x.quantita;
    totale += x.costoItem*x.quantita;
});

console.log(costoSpedizione);
totale = (totale*iva) + costoSpedizione; 
console.log(totale);

//data injection

let header = document.getElementById("header");
header.innerHTML += "<h1>"+nomeNegozio+"</h1>";
header.innerHTML += "<h2>"+salutoCliente+"</h2>";
let data = document.getElementById("tableData");
let row =  document.getElementsByClassName("rowElement")[0];
data.innerHTML = row.outerHTML;
console.log(row);

carrello.forEach(x => {
    row.getElementsByClassName("rowItemName")[0].innerHTML = x.nome;
    row.getElementsByClassName("rowItemPrice")[0].innerHTML = x.costoItem;
    row.getElementsByClassName("rowItemQuantity")[0].innerHTML = x.quantita;
    data.innerHTML += row.outerHTML;
});

let  footer = document.getElementById("footer");
footer.innerHTML += '<p> il costo di spedizione è : '+costoSpedizione+" euri </p>";
footer.innerHTML += '<p> il costo totale + iva  è : '+totale+" euri </p>";
footer.innerHTML += '<h3>'+saluto+"</h3>";













