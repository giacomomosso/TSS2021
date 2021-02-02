function studente(nome,cognome,matricola,annoDiNascita){
    this.nome = nome;
    this.cognome = cognome;
    this.matricola = matricola;
    this.annoDiNascita = annoDiNascita

    this.presentati = function(){
        return this.nome+" "+this.cognome;
    }
}