package testPrincipal;

import static org.junit.Assert.*;

import org.junit.Test;

import principal.Satelite;

public class TestSatelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;

	@Test
	public void TestConstructor1() {
		meridiano = 107;
		paralelo = 200;
		distancia_tierra = 500;
		Satelite satelite = new Satelite(meridiano, paralelo, distancia_tierra);
		assertEquals(satelite.meridiano, 107, 0);
		assertEquals(satelite.paralelo, 200, 0);
		assertEquals(satelite.distancia_tierra, 500, 0);
	}
	
	@Test
	public void TestConstructor2() {
		Satelite satelite = new Satelite();
		assertEquals(satelite.meridiano, 0, 0);
		assertEquals(satelite.paralelo, 0, 0);
		assertEquals(satelite.distancia_tierra, 0, 0);
	}
	
	@Test
	public void TestSetPosicion() {
		double meridianoTest = 22;
		double paraleloTest = 44;
		double distanciaTierraTest = 88;
		meridiano = 11;
		paralelo = 22;
		distancia_tierra = 44;
		Satelite satelite = new Satelite(meridiano, paralelo, distancia_tierra);
		satelite.setPosicion(meridianoTest, paraleloTest, distanciaTierraTest);
		assertEquals(satelite.meridiano, 22, 0);
		assertEquals(satelite.paralelo, 44, 0);
		assertEquals(satelite.distancia_tierra, 88, 0);
	}
}