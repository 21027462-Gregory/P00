import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	// To make it global
	int a, b ;
	Calculator cal = new Calculator();

	@Before
	public void setUp() throws Exception {
		a = 4321;
		b = 1234;
	}

	@Test
	public void testAdd() {
		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		int actual = cal.sub(a, b);
		int expected = 3087;
		assertEquals(expected, actual);
	}

	@Test
	public void testMult() {
		int actual = cal.mul(a, b);
		int expected = 5332114;
		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		int actual = cal.div(a, b);
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivideWith0Denominator() {
		
	}

	@After
	public void tearDown() throws Exception {
	}

}
