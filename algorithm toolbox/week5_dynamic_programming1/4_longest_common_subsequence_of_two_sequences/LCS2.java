import java.util.*;

public class LCS2 {

    private static int lcs2(int[] a, int[] b) {
        //Write your code here
        n=Math.max(a.length,b.length);
        int[][] d=new int[a.length][b.length];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(d[i][0]==d[0][j]){
                    count++;

                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b));
    }
}

