/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

/**
 *
 * @author Cleiton
 */
public interface CalculatorSimilarity<A> {
    public double distance(A a1, A a2);
}
