package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
public interface IO {
    Polinomial compute(Polinomial p1, Polinomial p2);

    static IO getInstance(String s) {
        switch (s) {
        
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Divition();
            case "Dif":
                return new Derivation();
            case "Int":
                return new Integration();
            default:
                return null;
        }
    }
}
