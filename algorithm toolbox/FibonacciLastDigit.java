import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigitNaive(long n) {
        if (n <= 60) {
            long a = (long) (1 / Math.sqrt(5) * (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n))) % 10;
            return a;
        }
        long c= n%60;
        long d = (long) (1 / Math.sqrt(5) * (Math.pow(((1 + Math.sqrt(5)) / 2), c) - Math.pow(((1 - Math.sqrt(5)) / 2), c))) % 10;
             return d;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

