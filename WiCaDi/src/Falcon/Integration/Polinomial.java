package Falcon.Integration;
/**
 *
 * @author Falcon -> Nethmi,Pubudu,Achintha,Rajitha,Mano(Team Falcon)
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polinomial {
    private List <Formula> elements = new ArrayList <Formula> ();

    public List<Formula> getElem() {
        return elements;
    }

    public Polinomial(String s) {
        Pattern p = Pattern.compile("(-?\\b\\d+)[xX]\\^(-?\\d+\\b)");
        Matcher m = p.matcher(s);
        while (m.find()) {
            this.add(new Formula(Float.parseFloat(m.group(1)), Integer.parseInt(m.group(2))));
        }
    }

    public void add(Formula m) {
        boolean found = false;
        for (Formula i : elements) {
            if (i.getGrad() == m.getGrad()) {
                i.setCoef(i.getCoef() + m.getCoef());
                found = true;
                break;
            }
        }
        if (!found)
            elements.add(m);
    }

    public int getGrad() {
        int max = 0;
        for(Formula m: elements) {
            if(!m.toString().equals("") && m.getGrad() > max)
                max = m.getGrad();
        }
        return max;
    }

    public Formula getLead() {
        Formula m = new Formula(0, 0);
        for(Formula i : elements) {
            if(!i.toString().equals("") && i.getGrad() >= m.getGrad()) {
                m.setGrad(i.getGrad());
                m.setCoef(i.getCoef());
            }
        }

        return m;
    }

    public boolean emptyList() {
        for(Formula m: elements) {
            if(m.getCoef() != 0)
                return false;
        }
        return true;
    }

    public String toString() {
        String result = "";
        for (Formula m : elements) {
            result += m.toString();
            if (!m.toString().equals(""))
                result += " + ";
        }
        char c = ' ';
        StringBuilder str = new StringBuilder(result);
        str.deleteCharAt(str.length() - 3);
        str.deleteCharAt(str.length() - 2);
        str.deleteCharAt(str.length() - 1);
        result = str.toString();
        return result;
    }
}
