package classused;

import classused.stack.StackExpression;

public class GenererExpression {
    public static String getExpression(){
        StackExpression exp=new StackExpression();
        return exp.getExpNpi();
    }
    public static String getEvaluation(String exp){
        return String.valueOf(StackExpression.evaluate(exp));
    }
}
