package tsksecond;

import org.apache.commons.math3.util.Precision;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DistanceTests {
	@Test
	public void DistantTest () {
		Points d = new Points(-6, -7, -7, -8);
		// Выделяю только один кейс на проверку правильности расчета.
		// Проверка с округлением сомнительна, т.к проверяется не расчет, а округление на мой взгляд (добавил для наглядности)
		double exResult = 1.4142135623730951;
		try {
			Assert.assertEquals(d.Distance(), exResult);
			System.out.println("Расстояние вычисленно верно D=" + d.Distance());
		} catch (AssertionError error) {
			System.out.println("Расстояние между точками вычислено неверно D=" + d.Distance() + " " + "Правильное D=" + exResult);
		}

		double exResult2 = 1.41;
		double d2 = Precision.round(d.Distance(),2);
		try {
			Assert.assertEquals(d2, exResult2);
			System.out.println("Расстояние вычисленно верно D="+ d2);
		} catch (AssertionError error){
			System.out.println("Расстояние между точками вычислено неверно D="+ d2 + " " + "Правильное D=" + exResult2);
		}



	}
}
