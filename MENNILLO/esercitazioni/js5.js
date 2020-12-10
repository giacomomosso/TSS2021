function getExtension() {
    var filename = document.getElementById("file1").value;
    var extension = filename.slice(-3);
    console.log(extension);
}
