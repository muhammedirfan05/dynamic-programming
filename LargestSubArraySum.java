// import java.util.*;
// public class LargestSubArraySum
// {
//     public static void main(String arg[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=7,cm=0,fm=0;
//         int a[]={-2,1,-3,4,-1,2,1,-5,4};
//         for(int i=0;i<n;i++)
//         {
//             cm=cm+a[i];
//             fm=Math.max(cm,fm);
//             if(cm<0)    cm=0;
//         }
//         System.out.println(fm);
//     }
// }
import java.util.*;

public class LargestSubArraySum {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n=7;
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        int cm = 0, fm = Integer.MIN_VALUE; // Initialize fm to the smallest integer value
        for (int i = 0; i < n; i++) {
            // int num = sc.nextInt();
            cm = Math.max(a[i], cm + a[i]);
            fm = Math.max(fm, cm);
        }
        System.out.println(fm);
        sc.close();
    }
}
