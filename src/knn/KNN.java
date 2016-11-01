package knn;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author andreendo
 *
 */
public class KNN <A> {

	private ArrayList<A> list;
	private A reference;
	private DistanceCalculatorInterface<A> distanceCalculator;
	
	public void setList(ArrayList<A> list) {
		this.list = list;
	}

	public void setReference(A reference) {
		this.reference = reference;
	}

	public ArrayList<A> getKNearestNeighbors(int k) {
		if(list == null || reference == null || distanceCalculator == null)
			throw new RuntimeException("null in list, reference and/or distanceCalculator");
		
		ArrayList<A> orderedList = new ArrayList<>(list); //create a copy
		
		Collections.sort(orderedList, new MyComparator<A>(reference, distanceCalculator) );
		
		ArrayList<A> nearestNeighbors = new ArrayList<>();
		
		for (int i = 0; i < k; i++) {
			nearestNeighbors.add( orderedList.get(i) );
		}
                
		return nearestNeighbors;
	}

	public void setDistanceCalculator(DistanceCalculatorInterface<A> distanceCalculator) {
		this.distanceCalculator = distanceCalculator;
	}



}
