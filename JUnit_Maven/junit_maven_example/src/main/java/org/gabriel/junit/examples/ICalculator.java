package org.gabriel.junit.examples;

public interface ICalculator {

    int sum(int a, int b);

    int subtract(int a, int b);

    int multiply(int a, int b);

    int divide(int a, int b) throws Exception;

    boolean equals(int a, int b);
}
