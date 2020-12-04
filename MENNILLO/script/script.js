function saluta(){
    alert("ciao");
}

saluta();
var utente = "";
function getNome(){
    utente = prompt("come ti chiami?");
}

function benvenuto(){
    var elbenvenuto = document.getElementById("benvenuto");
    elbenvenuto.innerHTML = mess;
}

getNome();
let mess = "ciao "+utente+" vattene in pausa";
benvenuto();