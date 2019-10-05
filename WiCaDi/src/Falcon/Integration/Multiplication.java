package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
public class Multiplication implements IO {

    public Polinomial compute(Polinomial p1, Polinomial p2) {
        Polinomial result = new Polinomial("");
        for(Formula i: p1.getElem()) {
            for(Formula j: p2.getElem()) {
                result.add(new Formula(j.getCoef() * i.getCoef(), j.getGrad() + i.getGrad()));
            }
        }
        return result;
    }
}
