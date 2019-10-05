package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
//import java.util.Collections;
import java.util.Comparator;

public class Subtraction implements IO {

    public Polinomial compute(Polinomial poli1, Polinomial poli2) {
        Polinomial result = new Polinomial("");
        result.getElem().addAll(poli1.getElem());
        for (Formula j : poli2.getElem()) {
           result.add(new Formula( -j.getCoef(), j.getGrad()));
        }

        return result;
    }
}
