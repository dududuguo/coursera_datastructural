
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long a= (long) (1/Math.sqrt (5)* (Math.pow(((1+Math.sqrt (5))/2),n) - Math.pow( ((1-Math.sqrt (5))/2),n)));

        System.out.println(a);
    }
}
