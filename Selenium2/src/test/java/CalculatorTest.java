import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator cal=new Calculator();

	@Test
	public void testAdd1() {
		assertEquals(10,cal.add1(5,5));
	}

	@Test
	public void testSub1() {
		assertEquals(0,cal.sub1(5,5));
	}

}
