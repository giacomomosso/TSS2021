var array = [0,1,2,3,4,5,6,7,8,9];

function findrandom(a){
    var random = Math.floor(Math.random()*a.length);
    
    console.log(a[random] + " " + random)
}

findrandom(array);