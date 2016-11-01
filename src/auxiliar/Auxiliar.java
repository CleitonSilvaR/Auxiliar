/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import static auxiliar.InstantiatingBib.carrega;
import static auxiliar.SimilarityText.matSimilarity;
import static auxiliar.SimilarityText.similarity;
import Util.Study;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cleiton
 */
public class Auxiliar {

    /**
     * @param args the command line arguments
     */
    public double aux(String a, String b){
        return similarity(a, b);
    }
    public static void main(String[] args) {
        
        List<Study> list1 = new ArrayList<Study>();
        list1 = carrega();
        List<Study> list2 = new ArrayList<Study>();
        list2 = carrega();
        matSimilarity(list1,list2);

//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
//            System.out.println("Autor   -> " + list1.get(i).getAuthor());
//            System.out.println("Titulo  -> " + list1.get(i).getTitle());
//            System.out.println("Coneudo -> " + list1.get(i).getContent());
//            System.out.println("Valor   -> " + list1.get(i).getValues());
//        }
//        System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
        System.out.println(list1.size());

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
            for (int j = 0; j < list2.size(); j++) {
                System.out.println(" ->>> "+ similarity(list1.get(i).getContent(), list2.get(j).getContent()));
            }
        }
    }
    
}
