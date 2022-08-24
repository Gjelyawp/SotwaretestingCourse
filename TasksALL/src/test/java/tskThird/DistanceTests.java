package tskThird;


import org.testng.Assert;
import org.testng.annotations.Test;



public class DistanceTests {
	@Test
	public void DistantTest() {
		Points p1 = new Points(6, 7);
		Points p2 = new Points(7, 8);
		double exResult = 1.4142135623730951;
		Assert.assertEquals(p2.Distance(p1), exResult);
	}


	@Test
	public void DistantTest2() {
		//отрицательные значения
		Points p1 = new Points(-6, 7);
		Points p2 = new Points(-7, 9);
		double exResult = 2.23606797749979;
		Assert.assertEquals(p2.Distance(p1), exResult);
	}

	@Test
	public void DistantTest3() {
		//с нулевой координатой
		Points p1 = new Points(-6, 7);
		Points p2 = new Points(1, 0);
		double exResult = 9.899494936611665;
		Assert.assertEquals(p2.Distance(p1), exResult);
	}
}

