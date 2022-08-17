import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    int current_gcd = 1;
    if(b>a){
      int c=a;
      a=b;
      b=c;
    }
    while(b!=0){
      int c=b;
      b=a%b;
      a=c;

      }
    current_gcd=a;
    return current_gcd;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
