package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
//import ro.tuc.tp.logica.ResultType;
public class Divition implements IO  {

    public ResultType computeR(Polinomial poli1, Polinomial poli2) {
        int grad1 = poli1.getGrad();
        int grad2 = poli2.getGrad();
        Polinomial copy = poli1;

        if(grad1 < grad2)
            return null;

        Polinomial resultloc = new Polinomial("");
        
        while(grad1 >= grad2) {
            
            Formula f1 = copy.getLead();
            Formula f2 = poli2.getLead();

            Formula t = new Formula(f1.getCoef() / f2.getCoef(), f1.getGrad() - f2.getGrad());
            Polinomial i = new Polinomial("");
            i.add(new Formula(-t.getCoef(), t.getGrad()));
            resultloc.add(t);
            Polinomial a = new Multiplication().compute(poli2, i);
            copy = new Addition().compute(copy, a);

            grad1 = copy.getGrad();
        }

        return new ResultType(resultloc, copy);
    }
    @Override
    public Polinomial compute(Polinomial poli1, Polinomial poli2) {
        return new Polinomial("");
    }
}