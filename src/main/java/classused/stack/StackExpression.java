package classused.stack;


import java.util.Stack;

public class StackExpression{
    String npi;
    final static String[] ops={"+","-","*","/"};//Liste des opérateurs


    public static int generateFValue(int max)
    {
        return 0 + (int)(Math.random() * ((max - 0) + 1));
    }

    public static char generateOperator()
    {
        String op="-+*/";
        int index=generateFValue(3);
        return (char) op.charAt(index);
    }

    public String getExpNpi(){
        npi=""+generateFValue(9);
		npi+=" ";
        npi+=generateFValue(9);
		npi+=" ";
        npi+=generateOperator();
		npi+=" ";
        npi+=generateFValue(9);
		npi+=" ";
        npi+=generateFValue(9);
		npi+=" ";
        npi+=generateOperator();
		npi+=" ";
        npi+=generateOperator();

        return npi;
    }
    public static int evaluate(String calc){
        Stack<String> op=new Stack<String>(); // Une pile, elle sera utilisé comme une pile LIFO
		String[] tabOp=calc.split(" ");//Retourne le tableau de chaine des élléments séparés par " " (espace blanc Ascii(20))
		for(int i=0;i<tabOp.length;i++){
			if(isOperande(tabOp[i])){//Si on est sur un opérateur, alors, on POP.
				int op1=Integer.parseInt(op.pop());
				int op2=Integer.parseInt(op.pop());
				op.push(doOperande(tabOp[i], op1, op2));//On effectue l'opération
			}else{
				op.push(tabOp[i]);//On est sur un opérande, on le stocke sur la pile
			}
		}
		return Integer.parseInt(op.pop());//On travail avec des chaines, il faut les convertir en entier.
	}
	public static boolean isOperande(String op){//Fonction wrap, elle permet de donner un sens à une ligne de code (Abstraction).
		return isIn(op,ops);
	}
	public static boolean isIn(String what,String[] where){//Vérifie la présence d'une chaine dans un tableau de chaine
		for(int i=0;i<where.length;i++){
			if(where[i].equals(what))return true;
		}
		return false;
	}
	public static String doOperande(String op,int op1,int op2){//Execute une opration, retourne 0 si l'opération est inconnue.(risque d'effets de bord, vous DEVEZ implémenter une exeption)
		if(op.equals("+")){
			return ""+(op1+op2);
		}else if(op.equals("-")){
			return ""+(op2-op1);
		}else if(op.equals("*")){
			return ""+op1*op2;
		}else if(op.equals("/")) {
            return "" + op2 / op1;
        }

		return "0";
	}

}
