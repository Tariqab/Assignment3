/**
 * 
 */
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void testCalulator() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}
	
	@Test
	public void testGetTotal() {
		Calculator test = new Calculator();
		test.add(5);
		test.multiply(5);
		test.subtract(3);
		assertEquals(22, test.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator test = new Calculator();
		test.add(5);
		test.add(4);
		assertEquals(9, test.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator test = new Calculator();
		test.add(10);
		test.subtract(3);
		assertEquals(7, test.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator test = new Calculator();
		test.add(3);
		test.multiply(7);
		assertEquals(21, test.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator test = new Calculator();
		test.add(20);
		test.divide(5);
		assertEquals(4, test.getTotal());
	}
	
	public void testDivideByZero() {
		Calculator test = new Calculator();
		test.add(10);
		test.divide(0);
		assertEquals(0, test.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator test = new Calculator();
		test.add(7);
		test.multiply(3);
		test.divide(2);
		test.subtract(1);		
		assertEquals("0 + 7 * 3 / 2 - 1", test.getHistory());
	}

}
