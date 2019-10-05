package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
public class Derivation implements IO {
    public Polinomial compute(Polinomial poli1, Polinomial poli2) {
        
        Polinomial result = new Polinomial("");
        
        for(Formula i: poli1.getElem()) {
            result.add(new Formula(i.getCoef() * i.getGrad(), i.getGrad() - 1));
        }
        return result;
    }
}
