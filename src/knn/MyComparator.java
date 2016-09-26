package knn;

import java.util.Comparator;

/**
 * 
 * @author andreendo
 *
 */
public class MyComparator<A> implements Comparator<A> {

	private A reference;
	private DistanceCalculatorInterface<A> distanceCalculator;
	
	public MyComparator(A reference,
			DistanceCalculatorInterface<A> distanceCalculator) {
		this.reference = reference;
		this.distanceCalculator = distanceCalculator;
	}

	@Override
	public int compare(A a1, A a2) {
		double a1DistToRef = distanceCalculator.distance(a1, reference);
		double a2DistToRef = distanceCalculator.distance(a2, reference);
		
		//-1 if a1 < a2
		if(a1DistToRef < a2DistToRef)
			return -1;
		
		//+1 if a1 > a2
		if(a1DistToRef > a2DistToRef)
			return +1;
		
		//0 if a1 = a2
		return 0;
	}

}
