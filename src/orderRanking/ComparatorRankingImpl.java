///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package orderRanking;
//
//import Util.Study;
//
//
//public class ComparatorRankingImpl implements ComparatorRanking<Ranking> {
//    
//    boolean crescente = false;
//    public ComparatorRankingImpl(boolean crescente) {
//        this.crescente = crescente;
//    }
//    public int compare(Ranking o1, Ranking o2) {
//        Ranking p1 = (Ranking) o1;
//        Ranking p2 = (Ranking) o2;
//        if (crescente) {
//            return p1.getRanking() < p2.getRanking() ? -1 : (p1.getRanking() > p2.getRanking() ? +1 : 0);
//        } else {
//            return p1.getRanking() < p2.getRanking() ? +1 : (p1.getRanking() > p2.getRanking() ? -1 : 0);
//        }
//    }
//}
