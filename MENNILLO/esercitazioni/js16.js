var testo = "Java Lorem ipsum sit dolor Java aliqua clara et pulcra sunt Java";

function cercaWord(word,testo){
    var results = testo.match(new RegExp("\\b" + word +"\\b", "g"));
    if(result != null){
    console.log(results);
    }
    else{
        console.log("parola non trovata");
    }

}

cercaWord("Jaa",testo);