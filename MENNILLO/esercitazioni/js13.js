for (var i = 0; i<100; i++){
    if(i%3 == 0 && i%5 != 0){
        console.log("ciao");
    }
    if(i%3 != 0 && i%5 == 0) {
        console.log("mondo");
    }
    if( i%3 == 0 && i%5 == 0){
        console.log("ciao mondo");   
    }
    else {
        console.log(i);
    }
}