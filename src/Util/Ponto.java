package Util;

/**
 * 
 * @author andreendo
 *
 */
public class Ponto {

	private double x, y;
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Ponto))
			return false;
		
		Ponto p = (Ponto) obj;
		
		if( doubleEqual(getX(), p.getX()) &&  doubleEqual(getY(), p.getY()) )
			return true;
			
		return false;
	}
	
	public boolean doubleEqual(double a, double b) {
		double c = a - b;
		if(Math.abs(c) <= 0.00001)
			return true;
		
		return false;
	}
}
