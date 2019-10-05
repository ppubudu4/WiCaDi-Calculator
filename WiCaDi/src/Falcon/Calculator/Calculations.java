/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Falcon.Calculator;

import java.util.regex.Pattern;
/**
 *
 * @author Falcon -> Achintha,Pubudu,Nethmi,Rajitha,Mano(Team Falcon)
 */
public class Calculations {
    
	private String Formula;
	
        private char tFormula= 'd';

	Calculations() {
		this.Formula="";
	}

	Calculations(String s) {
		this.Formula= s;
	}

	public void set(String s) {
		this.Formula= s;
	}

	public String get() {
		return this.Formula;
	}

	public String evaluate() {
		try {
			String r= (this.evaluateMain(this.Formula)+"");
			return r;
		}
		catch (NumberFormatException e) {
			return "Error";
		}
		catch(Exception e) {
			return "Error";
		}
	}

	public String evaluate(String expr) {
		try {
			this.Formula= expr;
			String r= (this.evaluateMain(expr)+"");
			return r;
		}
		catch (NumberFormatException e) {
                    
			return "Error";
		}
		catch(Exception e) {
			return "Error Occured";
		}
	}

	public void setMode(char cc) {
		if( cc== 'd' || cc== 'r' || cc=='g')
			this.tFormula= cc;
	}

	public char getMode() {
		return this.tFormula;
	}

	private double evaluateMain (String expression) throws Exception {

		expression= this.formatExpression(expression);

		char c_mul[]= {'(', 's', 'c', 't', 'L'};

		for(int i=1; i<expression.length(); i++) {
			for(int j=0; j<c_mul.length; j++)
				if(c_mul[j]== expression.charAt(i)) {
					if(isaNumber(expression.charAt(i-1))) {
						expression= expression.substring(0, i)+ '*' + expression.substring(i);
						i= -1;
						break;
					}
				}
		}

		if(expression.length()==0) {
			return 0.0;
		}
		
		
		while(true) {
			int brackets= 0;
			for(int i=0; i<expression.length(); i++) 
				if(expression.charAt(i)== '(')
					brackets++;
			if(brackets<1)
				break; 
			
                        for(int i=0; i<expression.length(); i++) {
				if(expression.charAt(i)=='(') {
					int subBrackets= 0;
					String subExpression= "";
					for(int j=i+1; j<expression.length(); j++) {
						if(expression.charAt(j)== '(') {
							subBrackets++;
							subExpression+= '(';
						}
						else if(expression.charAt(j)!= ')') {
							subExpression+= expression.charAt(j);
						}
						else if(expression.charAt(j)== ')') {
							if(subBrackets>0) {
								subExpression+= ')';
								subBrackets--;
							}
							else {
								i= expression.length();							
								double subResult= evaluateMain(subExpression);
								subExpression= '('+subExpression+')';
								expression= expression.replaceFirst(Pattern.quote(subExpression), ""+subResult);
								break;
							}
						}
					}
				}
			}
		} 

		// Multiple '+' or '-' evaluation...

		for(int i=0; i<expression.length()-1; i++) {
			if(expression.charAt(i)== '-' && expression.charAt(i+1)== '-') {
				
				expression= expression.substring(0, i)+ '+'+ expression.substring(i+2);
				
				i=-1;
			}
			else if(expression.charAt(i)== '+' && expression.charAt(i+1)== '+') {
				
				expression= expression.substring(0, i)+ '+'+ expression.substring(i+2);
				
				i=-1;
			}
			else if(expression.charAt(i)== '-' && expression.charAt(i+1)== '+') {
				
				expression= expression.substring(0, i)+ '-'+ expression.substring(i+2);
				
				i=-1;
			}
			else if(expression.charAt(i)== '+' && expression.charAt(i+1)== '-') {
				
				expression= expression.substring(0, i)+ '-'+ expression.substring(i+2);
				
				i=-1;
			}
		}


		// for (l)ogarithm base 10...

		for(int i=0; i<expression.length(); i++) {
			if(expression.charAt(i)== 'l') {
				String sub_expr_l= this.getVal(expression, i+1);
				if(sub_expr_l.length()<1)
					throw new NumberFormatException();
				double sub_res_l= Math.log(Double.parseDouble(sub_expr_l))/Math.log(10.0);
				sub_expr_l= 'l'+ sub_expr_l;
				expression= expression.replaceFirst(Pattern.quote(sub_expr_l), sub_res_l+"");
				expression= this.remove_e(expression);
				i= -1;
			}
		}

		

		// for Square root

		for(int i=0; i<expression.length(); i++) {
			if(expression.charAt(i)== '√') {
				String sub_expr_r_= this.getVal(expression, i+1);
				String sub_res_r_= Math.sqrt(Double.parseDouble(sub_expr_r_))+"";
				expression= expression.replaceFirst(Pattern.quote("√" +sub_expr_r_), sub_res_r_+"");
				expression= this.remove_e(expression);
				i= -1;
			}
		}

		

		//add prefix '~' to negative numbers

		char operations[]= {'^', '/', '*', '+', '-'};

		if(expression.charAt(0)=='-')
			expression= expression.replaceFirst(Pattern.quote("-"), "~");
		else if(expression.charAt(0)=='+')
			expression= expression.replaceFirst(Pattern.quote("+"), "");
		for(int i=1; i<expression.length()-2; i++) {
			for(int j=0; j<operations.length; j++) {
				if(operations[j]== expression.charAt(i)) {
					if(expression.charAt(i+1)== '-') {
						expression= (expression.substring(0,i+1)+'~'+expression.substring(i+2));
					}
					else if(expression.charAt(i+1)== '+') {
						expression= (expression.substring(0,i+1)+expression.substring(i+2));
					}
				}
			}
		}

		

		for(int i=0; i<expression.length(); i++) {
			boolean got_trig= false;
			String sub_expr= "";
			Double sub_res= 0.0;
			if(expression.charAt(i)== 's') {
				String tmp_sub_oper= this.getVal(expression, i+1);
				sub_expr= 's'+ tmp_sub_oper;
				if(tmp_sub_oper.charAt(0)=='~')
					tmp_sub_oper= '-'+ tmp_sub_oper.substring(1);
				if(this.tFormula== 'd')
					sub_res= Math.sin(Double.parseDouble(tmp_sub_oper)*Math.PI/180);
				else if(this.tFormula== 'r')
					sub_res= Math.sin(Double.parseDouble(tmp_sub_oper));
				else if(this.tFormula== 'g')
					sub_res= Math.sin(Double.parseDouble(tmp_sub_oper)*Math.PI/200);
				got_trig= true;
			}
			else if(expression.charAt(i)== 'c') {
				String tmp_sub_oper= this.getVal(expression, i+1);
				sub_expr= 'c'+ tmp_sub_oper;
				if(tmp_sub_oper.charAt(0)=='~')
					tmp_sub_oper= '-'+ tmp_sub_oper.substring(1);
				if(this.tFormula== 'd')
					sub_res= Math.cos(Double.parseDouble(tmp_sub_oper)*Math.PI/180);
				else if(this.tFormula== 'r')
					sub_res= Math.cos(Double.parseDouble(tmp_sub_oper));
				else if(this.tFormula== 'g')
					sub_res= Math.cos(Double.parseDouble(tmp_sub_oper)*Math.PI/200);
				got_trig= true;
			}
			else if(expression.charAt(i)== 't') {
				String tmp_sub_oper= this.getVal(expression, i+1);
				sub_expr= 't'+ tmp_sub_oper;
				if(tmp_sub_oper.charAt(0)=='~')
					tmp_sub_oper= '-'+ tmp_sub_oper.substring(1);
				if(this.tFormula== 'd')
					sub_res= Math.tan(Double.parseDouble(tmp_sub_oper)*Math.PI/180);
				else if(this.tFormula== 'r')
					sub_res= Math.tan(Double.parseDouble(tmp_sub_oper));
				else if(this.tFormula== 'g')
					sub_res= Math.tan(Double.parseDouble(tmp_sub_oper)*Math.PI/200);
				got_trig= true;
			}

			if(got_trig) {
				
				i=-1;
				String sub_res_s= ""+ sub_res;
				if(sub_res_s.charAt(0)== '-')
					sub_res_s= '~'+ sub_res_s.substring(1);
				expression= expression.replaceFirst(Pattern.quote(sub_expr), ""+sub_res_s);


				expression= this.remove_e(expression);
			}
		}

		

		

		char operators[]= {'^', '/', '*', '+', '-'};
		int NOperators[]= new int[operators.length];
		for(int i=0; i<NOperators.length; i++) {
			NOperators[i]=0;
		}

		for(int i=0; i<expression.length(); i++) {
			for(int j=0; j<operators.length; j++) {
				if(expression.charAt(i)== operators[j]) {
					NOperators[j]++;
					break;
				}
			}
		}

		String operator1, operator2;

		while(NOperators[0]>0) {
			operator1= "";
			operator2= "";
			boolean operatorFound= false;
			for(int i=0; i<expression.length(); i++) {
				if(expression.charAt(i)== '^' && !operatorFound) {
					operatorFound= true;
					continue;
				}
				if(!operatorFound) {
					if(expression.charAt(i)== '/' || expression.charAt(i)== '*' || expression.charAt(i)== '+' || expression.charAt(i)== '-')
						operator1= "";
					else
						operator1= operator1+expression.charAt(i);
				}
				else {
					if(expression.charAt(i)== '/' || expression.charAt(i)== '*' || expression.charAt(i)== '+' || expression.charAt(i)== '-' || expression.charAt(i)== '^') {
						break;
					}
					else {
						operator2= operator2+expression.charAt(i);
					}
				}
			}
			String subExpr= operator1+'^'+operator2;
			operator1= operator1.replace("~", "-");
			operator2= operator2.replace("~", "-");
			double sub_res= Math.pow(Double.parseDouble(operator1), Double.parseDouble(operator2));
			if(sub_res<0)
				expression= expression.replaceFirst(Pattern.quote(subExpr), "~"+(0-sub_res));
			else
				expression= expression.replaceFirst(Pattern.quote(subExpr), ""+sub_res);
			expression= this.remove_e(expression);
			
			NOperators[0]--;


			
		}

		while(NOperators[1]>0) { 
			operator1= "";
			operator2= "";
			boolean operator_found= false;
			for(int i=0; i<expression.length(); i++) {
				if(expression.charAt(i)== '/' && !operator_found) {
					operator_found= true;
					continue;
				}
				if(!operator_found) {
					if(expression.charAt(i)== '^' || expression.charAt(i)== '*' || expression.charAt(i)== '+' || expression.charAt(i)== '-')
						operator1= "";
					else
						operator1= operator1+expression.charAt(i);
				}
				else {
					if(expression.charAt(i)== '/' || expression.charAt(i)== '*' || expression.charAt(i)== '+' || expression.charAt(i)== '-' || expression.charAt(i)== '^') {
						break;
					}
					else {
						operator2= operator2+expression.charAt(i);
					}
				}
			}
			String sub_expr= operator1+'/'+operator2;
			operator1= operator1.replace("~", "-");
			operator2= operator2.replace("~", "-");
			double sub_res= Double.parseDouble(operator1)/ Double.parseDouble(operator2);
			if(sub_res<0)
				expression= expression.replaceFirst(Pattern.quote(sub_expr), "~"+(0-sub_res));
			else
				expression= expression.replaceFirst(Pattern.quote(sub_expr), ""+sub_res);
			expression= this.remove_e(expression);
			
			NOperators[1]--;


			
		}

		while(NOperators[2]>0) { 
			operator1= "";
			operator2= "";
			boolean operator_found= false;
			for(int i=0; i<expression.length(); i++) {
				if(expression.charAt(i)== '*' && !operator_found) {
					operator_found= true;
					continue;
				}
				if(!operator_found) {
					if(expression.charAt(i)== '^' || expression.charAt(i)== '/' || expression.charAt(i)== '+' || expression.charAt(i)== '-')
						operator1= "";
					else
						operator1= operator1+expression.charAt(i);
				}
				else {
					if(expression.charAt(i)== '/' || expression.charAt(i)== '*' || expression.charAt(i)== '+' || expression.charAt(i)== '-' || expression.charAt(i)== '^') {
						break;
					}
					else {
						operator2= operator2+expression.charAt(i);
					}
				}
			}
			String subExpr= operator1+'*'+operator2;
			operator1= operator1.replace("~", "-");
			operator2= operator2.replace("~", "-");
			double sub_res= Double.parseDouble(operator1)* Double.parseDouble(operator2);
			if(sub_res<0)
				expression= expression.replaceFirst(Pattern.quote(subExpr), "~"+(0-sub_res));
			else
				expression= expression.replaceFirst(Pattern.quote(subExpr), ""+sub_res);
			expression= this.remove_e(expression);
			
			NOperators[2]--;


			
		}

		while(NOperators[3]>0) { 
			operator1= "";
			operator2= "";
			boolean operator_found= false;
			for(int i=0; i<expression.length(); i++) {
				if(expression.charAt(i)== '+' && !operator_found) {
					operator_found= true;
					continue;
				}
				if(!operator_found) {
					if(expression.charAt(i)== '^' || expression.charAt(i)== '/' || expression.charAt(i)== '*' || expression.charAt(i)== '-')
						operator1= "";
					else
						operator1= operator1+expression.charAt(i);
				}
				else {
					if(expression.charAt(i)== '/' || expression.charAt(i)== '*' || expression.charAt(i)== '+' || expression.charAt(i)== '-' || expression.charAt(i)== '^') {
						break;
					}
					else {
						operator2= operator2+expression.charAt(i);
					}
				}
			}
			String subExpr= operator1+'+'+operator2;
			operator1= operator1.replace("~", "-");
			operator2= operator2.replace("~", "-");
			double sub_res= Double.parseDouble(operator1)+ Double.parseDouble(operator2);
			if(sub_res<0)
				expression= expression.replaceFirst(Pattern.quote(subExpr), "~"+(0-sub_res));
			else
				expression= expression.replaceFirst(Pattern.quote(subExpr), ""+sub_res);
			
			NOperators[3]--;
		}

		while(NOperators[4]>0) { 
			operator1= "";
			operator2= "";
			boolean operator_found= false;
			for(int i=0; i<expression.length(); i++) {
				if(expression.charAt(i)== '-' && !operator_found) {
					operator_found= true;
					continue;
				}
				if(!operator_found) {
					if(expression.charAt(i)== '^' || expression.charAt(i)== '/' || expression.charAt(i)== '*' || expression.charAt(i)== '+')
						operator1= "";
					else
						operator1= operator1+expression.charAt(i);
				}
				else {
					if(expression.charAt(i)== '/' || expression.charAt(i)== '*' || expression.charAt(i)== '+' || expression.charAt(i)== '-' || expression.charAt(i)== '^') {
						break;
					}
					else {
						operator2= operator2+expression.charAt(i);
					}
				}
			}
			String subExpr= operator1+'-'+operator2;
			operator1= operator1.replace("~", "-");
			operator2= operator2.replace("~", "-");
			double sub_res= Double.parseDouble(operator1)- Double.parseDouble(operator2);
			if(sub_res<0)
				expression= expression.replaceFirst(Pattern.quote(subExpr), "~"+(0-sub_res));
			else
				expression= expression.replaceFirst(Pattern.quote(subExpr), ""+sub_res);
			
			NOperators[4]--;
		}

		
		if(expression.charAt(0)== '~')
			expression= '-'+ expression.substring(1);
		

		
		return Double.parseDouble(expression);
	}

	private String getVal(String expr, int position) {
		String result= ""+expr.charAt(position);
		char trigOP[]= {'s', 'c', 't'};
		char operators[]= {'^', '/', '*', '+', '-'};
		boolean end= false;

		for(int i=position+1; i<expr.length() && !end; i++) {

			for(int j=0; j<operators.length && !end; j++) {
				if(operators[j]== expr.charAt(i)) {
					end= true;
				}
			}
			for(int j=0; j<trigOP.length && !end; j++) {
				if(trigOP[j]== expr.charAt(i)) {
					end= true;
				}
			}
			if(!end) {
				result= result+expr.charAt(i);
			}
		}
		return result;
	}

	private boolean isaNumber(char c) {
		char numbers[]= {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.'};
		boolean isanumber= false;
		for(int i=0; i<numbers.length; i++)
			if(c== numbers[i]) {
				isanumber= true;
				break;
			}
		return isanumber;
	}

	private static boolean isaNumberr(char c) {
		char numbers[]= {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.'};
		boolean is_a_number= false;
		for(int i=0; i<numbers.length; i++)
			if(c== numbers[i]) {
				is_a_number= true;
				break;
			}
		return is_a_number;
	}

	private String remove_e(String expr) {

		boolean eFound= false;
		String prev= "", next= "";

		for(int cu=0; cu<expr.length(); cu++) {
			if(isaNumberr(expr.charAt(cu))) {
				if(eFound)
					next+= expr.charAt(cu);
				else
					prev+= expr.charAt(cu);
			}
			else if(expr.charAt(cu)== '-' && eFound && next.length()<1) {
				next+='-';
				
			}
			else if(expr.charAt(cu)== '~' && eFound && next.length()<1) {
				next+='-';
				
			}
			else if(expr.charAt(cu)=='E') {
				eFound= true;
				
			}
			else {
				if(eFound) {
					double value= Double.parseDouble(prev+'E'+next);
					expr= expr.replaceFirst(Pattern.quote(prev+'E'+next), String.format("%.8f", value));
					eFound= false;
					prev= "";
					next= "";
					cu= -1;
				}
				else {
					eFound= false;
					prev= "";
					next= "";
				}
			}
		}
		if(eFound) {
			double value= Double.parseDouble(prev+'E'+next);
			expr= expr.replaceFirst(Pattern.quote(prev+'E'+next), String.format("%.8f", value));
			eFound= false;
			prev= "";
			next= "";
		}

		return expr;
	}



	private String formatExpression(String expr) {

		
		expr= expr.replace("PI", Math.PI+"");
		expr= expr.replace("RND", Math.random()+"");



		expr= expr.replace("c", "b");

		expr= expr.replace("Sin", "s");
		expr= expr.replace("Cos", "c");
		expr= expr.replace("Tan", "t");
	
		expr= expr.replace("ln", "L");
		expr= expr.replace("log", "l");

		return expr;
	}

	public double round(double value, int scale) {
    	return Math.round(value * Math.pow(10, scale)) / Math.pow(10, scale);
	}

	boolean isRight() {
		String exppression= Formula;
		String numbers= "0123456789.";
		String operators= "+-*/^";
		String trig= "SCTsctLl";
		boolean strongSearch= true;

		int stackPos= 0;

		for(int i=0; i<exppression.length(); i++) {
			if(exppression.charAt(i) == '(') {
				stackPos++;
			}
			else if(exppression.charAt(i) == ')') {
				if(stackPos>0) {
					stackPos--;
				}
				else {
					return false;
				}
			}
			else {
				if(strongSearch && i<exppression.length()-1) {
					if(isin(exppression.charAt(i), operators)) {
						if(isin(exppression.charAt(i+1), operators)) {
							return false;
						}
					}
					else if(isin(exppression.charAt(i), trig)) {
						if(isin(exppression.charAt(i+1), trig)) {
							return false;
						}
					}
				}
			}
		}
		if(stackPos == 0) {
			return true;
		}
		return false;
	}

	private boolean isin(char c, String str) {
		for(int i=0; i<str.length(); i++) {
			if(c == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
