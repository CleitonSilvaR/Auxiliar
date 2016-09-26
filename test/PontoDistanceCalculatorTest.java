

import static org.junit.Assert.*;

import org.junit.Test;

import Util.Ponto;
import Util.PontoDistanceCalculator;

/**
 * 
 * @author andreendo
 *
 */
public class PontoDistanceCalculatorTest {

	@Test
	public void testEuclideanDistance() {
		Ponto p1 = new Ponto(0, 2);
		Ponto p2 = new Ponto(2, 0);
		Ponto p3 = new Ponto(3, 1);
		Ponto p4 = new Ponto(5, 1);
		
		PontoDistanceCalculator pdc = new PontoDistanceCalculator();
		
		System.out.println(pdc.distance(p1, p1));
		assertEquals(0, pdc.distance(p1, p1), 0.00001);

		System.out.println(pdc.distance(p1, p2));
		assertEquals(2.828, pdc.distance(p1, p2), 0.001);
		
		System.out.println(pdc.distance(p1, p3));
		assertEquals(3.162, pdc.distance(p1, p3), 0.001);

		System.out.println(pdc.distance(p1, p4));
		assertEquals(5.099, pdc.distance(p1, p4), 0.001);
	}
}
