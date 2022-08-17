import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    int[] arr=new int[n];
    arr[0]=0;
    arr[1]=1;
    arr[2]=2;

    if (n <= 2){
      int b =arr[n];
      return b;
    }

    for(int i=2;i<n;++i){
      arr[i]=arr[i-1]+arr[i-2];
      System.out.println(arr[n]);
    }

    int a=arr[n];

    return a;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] array= new int[n];

    System.out.println(calc_fib(n));
  }
}
