package pkg;


import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class SquareRectangleTests {
	@Test
	public void testArea (){
		Square s = new Square(5);
		assertEquals(s.Calc(),25);
	}
	@Test
	public void testAreaA (){
		Rectangle r = new Rectangle(5,5);
		Assert.assertEquals(r.Calc(),25);

	}
}
