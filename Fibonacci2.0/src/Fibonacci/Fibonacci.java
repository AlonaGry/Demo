package Fibonacci;

import java.math.BigDecimal;

public class Fibonacci {
    int N = 92;
    double n = N / 2;

    BigDecimal F = new BigDecimal(0);

    F = BigDecimal.valueOf(((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5)));

}
