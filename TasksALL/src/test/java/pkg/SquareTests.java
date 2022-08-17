package pkg;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
	@Test
	public void testArea (){
		Square s = new Square(5);
		Assert.assertEquals(s.Calc(),25);
	}
}
