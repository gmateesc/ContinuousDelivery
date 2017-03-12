package org.gabriel.junit.examples;

//
// This uses JUnit 4.x API
//

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import org.junit.Rule;
import org.junit.rules.*;

public class CalculatorTest {

    private static ICalculator calculator;


    @Rule
	public ExpectedException thrown = ExpectedException.none();


    @BeforeClass
	public static void initCalculator() {
	//System.out.println("This is BeforeClass\n");
	calculator = new Calculator();
    }

    @Before
	public void beforeEachTest() {
	//System.out.println("This is executed before each Test");
    }

    @After
	public void afterEachTest() {
	//System.out.println("This is executed after each Test\n");
    }

    @Test
	public void testSum() {
	System.out.println("@Test sum()");
	int result = calculator.sum(3, 4);

	assertEquals(7, result);
    }

    @Test
	public void testDivide() {
	System.out.println("@Test divide()");
	try {
	    int result = calculator.divide(10, 2);

	    assertEquals(5, result);
	} catch (Exception e) {
	    e.printStackTrace(System.err);
	}
    }

    //
    // Method 1
    //@Test(expected = ArithmeticException.class)
    //
    public void testDivideByZero() throws Exception {
	// Method 2
	// 
	thrown.expect(ArithmeticException.class);
	System.out.println("@Test divide by zero");
	calculator.divide(10, 0);
    }


    @Test
	public void testEquals() {
	System.out.println("@Test equals()");
	boolean result = calculator.equals(20, 20);
	assertTrue(result);
    }


    // Use @Ignore annotation to disable running a test
    //@Ignore
    @Test
	public void testSubtract() {
	System.out.println("@Test subtract()");
	int result = calculator.subtract(10, 3);
	assertTrue(result == 7);
    }
}
