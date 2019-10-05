package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
import java.util.*;

public class Addition implements IO {

    public Polinomial compute(Polinomial poli1, Polinomial poli2) {
        Polinomial result = new Polinomial("");
        result.getElem().addAll(poli1.getElem());
        
        for (Formula f : poli2.getElem()) {
            result.add(new Formula(f.getCoef(), f.getGrad()));
        }
        return result;
    }
}
