package Util;

import knn.DistanceCalculatorInterface;

/**
 * 
 * @author andreendo
 *
 */
public class PontoDistanceCalculator implements DistanceCalculatorInterface<Ponto> {

	@Override
	public double distance(Ponto a1, Ponto a2) {
		double t_ = (a1.getX() - a2.getX()) * (a1.getX() - a2.getX()) + (a1.getY() - a2.getY()) * (a1.getY() - a2.getY());   
		return Math.sqrt(t_);
	}

}
