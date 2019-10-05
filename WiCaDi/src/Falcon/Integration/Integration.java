package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
public class Integration implements IO {
    @Override
    public Polinomial compute(Polinomial poli1, Polinomial poli2) {
        Polinomial result = new Polinomial("");
        for(Formula i: poli1.getElem()) {
            result.add(new Formula((float)i.getCoef() / (i.getGrad()+1), i.getGrad()+1));
        }

        return result;
    }
}
