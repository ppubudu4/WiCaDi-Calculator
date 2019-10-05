package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
//package ro.tuc.tp.logica;

//import javax.xml.transform.Result;

public class ResultType {
    Polinomial poli1 = new Polinomial("");
    Polinomial poli2 = new Polinomial("");

    public ResultType() {}

    public ResultType(Polinomial poli1, Polinomial ploi2) {
        this.poli1 = poli1;
        this.poli2 = poli2;
    }

    public Polinomial getP() {
        return poli1;
    }

    public void setP(Polinomial p) {
        this.poli1 = poli1;
    }

    public Polinomial getR() {
        return poli2;
    }

    public void setR(Polinomial r) {
        this.poli2 = poli2;
    }

    public String toString() {
        if(!poli2.emptyList())
            return "C: " + poli1 + "; R: " + poli2;
        return "C: " + poli1;
    }
}