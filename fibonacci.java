import java.math.BigInteger;

public class fibonacci {
    public static void main(String[] args) {
        int n = 100;
        BigInteger[] fib = new BigInteger[n];

        // Base cases
        if (n > 0) {
            fib[0] = BigInteger.ZERO;
        }
        if (n > 1) {
            fib[1] = BigInteger.ONE;
        }

       
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }

       
        for (int i = 0; i < n; i++) {
            System.out.println("F(" + i + ") = " + fib[i]);
        }
    }
}