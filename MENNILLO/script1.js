let arrayFilm = ["via col vento","il grande gatsby","il conte di monecristo","top gun","avatar"];

let element = document.getElementById("app");
console.log(element);

for(var t in arrayFilm){
    element.innerHTML += '<p>'+'film '+eval(t)+' : '+arrayFilm[t]+'</p>'; 
}