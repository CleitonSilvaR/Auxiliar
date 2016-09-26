/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import Util.Study;
import java.util.Comparator;

/**
 *
 * @author Cleiton
 */
public class MyComparator2<A> implements Comparator<A> {

    private A reference;
    private CalculatorSimilarity<A> distanceCalculator;

    public MyComparator2(A reference,
            CalculatorSimilarity<A> distance) {
        this.reference = reference;
        this.distanceCalculator = distance;
    }

    @Override
    public int compare(A a1, A a2) {
        double a1DistToRef = distanceCalculator.distance(a1, reference);
        Study aux = (Study) a1;
        Study aux2 = (Study) a2;
        double a2DistToRef = distanceCalculator.distance(a2, reference);
        
        System.out.println("1 " +aux.getAuthor());
        System.out.println("2 " +aux2.getAuthor());
        System.out.println("");
        System.out.println(a1DistToRef);
        System.out.println(a2DistToRef);

        //-1 if a1 < a2
        if (a1DistToRef < a2DistToRef) {
            return -1;
        }

        //+1 if a1 > a2
        if (a1DistToRef > a2DistToRef) {
            return +1;
        }

        //0 if a1 = a2
        return 0;
    }
}
