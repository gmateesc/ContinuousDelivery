package org.gabriel.junit.examples;

//
// Using the JUnit 3.x API
//
//   o the class extends TestCase
//
//   o annotations such as @Test and @Rule 
//     are not supported
//

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

// These are for JUnit 4.x
//  import org.junit.Test;
//  import org.junit.After;
//  import org.junit.Before;
//  import org.junit.BeforeClass;
//  import org.junit.Ignore;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class ICalculatorTest extends TestCase {


    private static ICalculator calculator;

  
    public static TestSuite suite() {
	//System.out.println("suite()");
	return new TestSuite(ICalculatorTest.class);
    }

    protected void setUp() {
	//System.out.println("\nThis is setUp");
	calculator = new Calculator();
    }
   


    //@Test
    public void testSum() {

	System.out.println("@Test sum()");
	int result = calculator.sum(3, 4);
	assertEquals(7, result);
    }



    //@Test
    public void testDivide() {
	System.out.println("@Test divide()");
	try {
	    int result = calculator.divide(10, 2);
	    assertEquals(5, result);
	} 
	catch (Exception e) {
	    e.printStackTrace(System.err);
	}
    }



    //@Test
    public void testDivideByZeroException() throws Exception {

	System.out.println("@Test divide by zero");
	//thrown.expect(Exception.class);
	//thrown.expectMessage("Divide by zero");
	try {
	    calculator.divide(10, 0);
	    fail("Expecting divide by zero");
	}
	catch (Exception expected) {
	    //System.out.println("Got an expected exception: " + expected.getMessage());
	}
    }



    //@Test
    public void testEqual() {

	System.out.println("@Test equals() ");
	boolean result = calculator.equals(20, 20);
	assertTrue(result);
    }



    //@Test
    public void testSubst() {

	System.out.println("@Test subtract()");
	int result = calculator.subtract(10, 3);
	assertTrue(result == 7);
    }

}
