package org.gabriel.junit.examples;

public class Calculator implements ICalculator {

    @Override
	public int sum(int a, int b) {
	return a + b;
    }

    @Override
	public int subtract(int a, int b) {
	return a - b;
    }

    @Override
	public int multiply(int a, int b) {
	return a * b;
    }

    // See
    // http://stackoverflow.com/questions/\
    // 1657887/how-should-i-throw-a-divide-by-zero-exception-in-java-without-actually-dividing
    @Override
	public int divide(int a, int b) throws ArithmeticException {
	if (b == 0) {
	    throw new ArithmeticException("Divider can't be zero");
	}

	return a / b;
    }

    @Override
	public boolean equals(int a, int b) {
	boolean result = false;

	if (a == b) {
	    result = true;
	}

	return result;
    }
}
