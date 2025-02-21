import java.util.*;
import java.math.BigInteger;

public class Main {
    // Function to calculate factorial of a number
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Function to calculate the greatest common divisor (GCD) of two numbers
    private static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO)) {
            return a;
        }
        return gcd(b, a.mod(b));
    }

    // Function to calculate the average distance
    public static String averageDistance(int n, int[] a) {
        BigInteger totalDistance = BigInteger.ZERO;

        // Precompute factorials
        BigInteger factNMinus1 = factorial(n - 1);
        BigInteger factNMinus2 = factorial(n - 2);

        // Sum of distances from the start (0) to each destination
        BigInteger sumFromStart = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            sumFromStart = sumFromStart.add(BigInteger.valueOf(a[i]));
        }
        totalDistance = totalDistance.add(sumFromStart.multiply(factNMinus1));

        // Sum of absolute differences between all pairs of destinations
        BigInteger sumAbsDiff = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sumAbsDiff = sumAbsDiff.add(BigInteger.valueOf(Math.abs(a[i] - a[j])));
            }
        }
        totalDistance = totalDistance.add(sumAbsDiff.multiply(factNMinus2).multiply(BigInteger.valueOf(2)));

        // Calculate the average distance
        BigInteger factN = factorial(n);
        BigInteger gcdValue = gcd(totalDistance, factN);

        // Simplify the fraction
        BigInteger numerator = totalDistance.divide(gcdValue);
        BigInteger denominator = factN.divide(gcdValue);

        return numerator + " " + denominator;
    }

    public static void main(String[] args) {
        // Test Case
        int n = 5;
        int[] a = {3, 5, 9, 18, 35};

        // Calculate and print the result
        String result = averageDistance(n, a);
        System.out.println(result); // Expected Output: 35918 5
    }
}