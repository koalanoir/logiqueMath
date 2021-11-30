package classused;

import java.util.ArrayList;
import java.util.List;

/**
 * partie est un bean qui implemente les données d'une partie
 * serie est une listes d'expressions polonaise post fixée généré aléatoirement
 * solutions est la liste des solution du calcul de chaque expression de la liste serie
 */
public class partie {
    private List<String> serie;
    private List<String> solutions;
    private List<String> propositions;



    public partie(){
        serie=new ArrayList<>();
        solutions=new ArrayList<>();
        propositions=new ArrayList<>();
        String clone="";
        for(int i=0;i<10;i++){
            clone=GenererExpression.getExpression();
            serie.add(clone);
            solutions.add(GenererExpression.getEvaluation(clone));
        }

    }

    public List<String>  getSerie(){
        return serie;
    }

    public List<String> getSolution(){
        return solutions;
    }
    public List<String> getPropositions(){
        return propositions;
    }
    public void setProposition(String p){
        propositions.add(p);
    }
}
