package Number;

import java.util.ArrayList;
import java.util.List;

public class CircularPrimesNumber {
	  // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to generate all rotations of a number
    public static List<Integer> generateRotations(int n) {
        List<Integer> rotations = new ArrayList<>();
        String numStr = Integer.toString(n);
        int len = numStr.length();

        for (int i = 0; i < len; i++) {
            String rotatedStr = numStr.substring(i) + numStr.substring(0, i);
            rotations.add(Integer.parseInt(rotatedStr));
        }
        return rotations;
    }

    // Function to check if all rotations of a number are prime
    public static boolean isCircularPrime(int n) {
        List<Integer> rotations = generateRotations(n);
        for (int rotation : rotations) {
            if (!isPrime(rotation)) {
                return false;
            }
        }
        return true;
    }

    // Function to print all circular primes up to a given limit
    public static void printCircularPrimes(int limit) {
        System.out.println("Circular primes up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isCircularPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int limit = 1000;  // You can change the limit here
        printCircularPrimes(limit);
    }
}
