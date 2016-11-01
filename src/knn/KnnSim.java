/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Cleiton
 */
public class KnnSim <A> {

	private ArrayList<A> list;
	private A reference;
	private CalculatorSimilarity<A> distanceCalculator;
	
	public void setList(ArrayList<A> list) {
		this.list = list;
	}

	public void setReference(A reference) {
		this.reference = reference;
	}

	public ArrayList<A> getKNearestNeighbors(int k) {
            //reference == null ||
		if(list == null ||  distanceCalculator == null)
			throw new RuntimeException("null in list, reference and/or distanceCalculator");
		
		ArrayList<A> orderedList = new ArrayList<>(list); //create a copy
		
                System.out.println("----------------");
		Collections.sort(orderedList, new MyComparator2<A>(reference, distanceCalculator) );
		
		ArrayList<A> nearestNeighbors = new ArrayList<>();
		
		for (int i = 0; i < k; i++) {
			nearestNeighbors.add( orderedList.get(i) );
		}
		
		return nearestNeighbors;
	}

	public void setDistanceCalculator(CalculatorSimilarity<A> distanceCalculator) {
		this.distanceCalculator = distanceCalculator;
	}
}
