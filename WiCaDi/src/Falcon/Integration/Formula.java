package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
public class Formula {
    private int grad;
    private float coef;

    public Formula() {
        grad = 0;
        coef = 0;
    }

    public Formula(float coef, int grad) {
        this.coef = coef;
        this.grad = grad;
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public float getCoef() {
        return coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    public String toString() {
        if (coef == 0.0)
            return "";
        else if (grad == 0)
            return coef + "";
        else
            return coef + "x^" + grad;
    }
}
