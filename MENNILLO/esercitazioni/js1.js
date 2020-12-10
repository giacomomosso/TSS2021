function Triangolo(latoA,latoB,latoC) {
    this.latoA = latoA;
    this.latoB = latoB;
    this.latoC = latoC;
    this.perimetro = function() {
        return this.latoC+this.latoA+this.latoB
    },
    this.area = function() {
        return Math.sqrt(this.perimetro()*(this.perimetro() - latoA)*(this.perimetro() - latoB)*(this.perimetro() - latoC))
    }

}

var mytriangolo =  new Triangolo(5,6,7);

console.log(mytriangolo.perimetro()+" "+mytriangolo.area());