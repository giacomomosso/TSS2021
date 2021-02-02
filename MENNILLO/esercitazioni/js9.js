function uppercase() {
    var data = document.getElementById("text2").value;
    var splitString = data.split(" "); 
    for (var i = 0; i<splitString.length; i++){
        splitString[i] = splitString[i][0].toUpperCase() + splitString[i].substr(1);
    }
    var joinArray = splitString.join(" ");
    console.log(joinArray);
}  