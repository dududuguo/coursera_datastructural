import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigitNaive(long n) {
        long a= (long) (1/Math.sqrt (5)* (Math.pow(((1+Math.sqrt (5))/2),n) - Math.pow( ((1-Math.sqrt (5))/2),n)));
        long b=a % 10;
        return b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

