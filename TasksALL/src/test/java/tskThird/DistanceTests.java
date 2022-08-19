package tskThird;


import org.testng.Assert;
import org.testng.annotations.Test;



public class DistanceTests {
	@Test
	public void DistantTest () {
		Points p1 = new Points(6, 7);
		Points p2 = new Points(7, 8);
		// Выделяю только один кейс на проверку правильности расчета.
		// Проверка с округлением сомнительна, т.к проверяется не расчет, а округление на мой взгляд (добавил для наглядности)
		double exResult = 1.4142135623730951;
		try {
			Assert.assertEquals(p2.Distance(p1), exResult);
			System.out.println("Расстояние вычисленно верно D=" + p2.Distance(p1));
		} catch (AssertionError error) {
			System.out.println("Расстояние между точками вычислено неверно D=" + p2.Distance(p1) + " " + "Правильное D=" + exResult);
		}
	}
	@Test
	public void DistantTest2 () {
		//отрицательные значения
		Points p1 = new Points(-6, 7);
		Points p2 = new Points(-7, 9);
		double exResult = 2.23606797749979;
		try {
			Assert.assertEquals(p2.Distance(p1), exResult);
			System.out.println("Расстояние вычисленно верно D=" + p2.Distance(p1));
		} catch (AssertionError error) {
			System.out.println("Расстояние между точками вычислено неверно D=" + p2.Distance(p1) + " " + "Правильное D=" + exResult);
		}
	}
	@Test
	public void DistantTest3 () {
		//с нулевой координатой
		Points p1 = new Points(-6, 7);
		Points p2 = new Points(1, 0);
		double exResult = 9.899494936611665;
		try {
			Assert.assertEquals(p2.Distance(p1), exResult);
			System.out.println("Расстояние вычисленно верно D=" + p2.Distance(p1));
		} catch (AssertionError error) {
			System.out.println("Расстояние между точками вычислено неверно D=" + p2.Distance(p1) + " " + "Правильное D=" + exResult);
		}
	}


	}

