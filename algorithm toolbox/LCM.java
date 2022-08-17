import java.util.*;

public class LCM {
  private static long lcm_naive(long a, long b) {
    long current_gcd=gcd(a,b);
    long LM=a*b/current_gcd;

    return LM;
  }
    private static long gcd (long a, long b){
    long current_gcd = 1;
    if(b>a){
      long c=a;
      a=b;
      b=c;
    }
    while(b!=0){
      long c=b;
      b=a%b;
      a=c;

    }current_gcd=a;
    return current_gcd;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextInt();
    long b = scanner.nextInt();
    System.out.println(lcm_naive(a,b));
  }
}
