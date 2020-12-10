function reverse() {
    var data = document.getElementById("text1").value;
    var splitString = data.split(""); 
    var reverseArray = splitString.reverse(); 
    var joinArray = reverseArray.join("");
    console.log(joinArray);
}  