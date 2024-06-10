import java.util.*;

public class NumberOfWaysMaze {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m + 1][n + 1];
        a[1][1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i - 1 >= 1)  a[i][j] += a[i - 1][j];
                if (j - 1 >= 1)  a[i][j] += a[i][j - 1];
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
