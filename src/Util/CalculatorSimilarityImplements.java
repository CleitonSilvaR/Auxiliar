package Util;

import knn.CalculatorSimilarity;
import knn.DistanceCalculatorInterface;

/**
 * 
 * @author andreendo
 *
 */
public class CalculatorSimilarityImplements implements DistanceCalculatorInterface<Study> {

	@Override
	public double distance(Study a1, Study a2) {
            System.out.println(a1.getTitle()+ " -- " + a2.getTitle() + " : " + SimilarityText.similarity(a1, a2));
		return 1.0 - SimilarityText.similarity(a1, a2);
	}

}
