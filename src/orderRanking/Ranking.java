/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderRanking;
import Util.Study;

/**
 *
 * @author Cleiton
 */
public class Ranking  implements Comparable<Object>{
    private Study study;
    private int ranking;
    
    private int values ;
    

    @Override
    public String toString() {
        return "Ranking{" + "study=" + study + ", ranking=" + ranking + '}';
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Ranking() {
    }

    public Ranking(Study study, int ranking) {
        this.study = study;
        this.ranking = ranking;
    }

    public int compareTo2(Ranking o) {
         if (this.values > o.getRanking()) {
            return 1;
        }
        if (this.values < o.getRanking()) {
            return -1;
        }
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return compareTo2((Ranking) o);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
