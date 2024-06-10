// import java.util.*;
public class Knapsack0bar1
{
    public static void main(String arg[])
    {
        // Scanner sc=new Scanner(System.in);
        int n=4,m=8;
        int p[]={0,1,2,5,6};
        int w[]={0,2,3,4,5};
        int sol[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0||j==0)
                    sol[i][j]=0;
                else if(j>=w[i])
                    sol[i][j]=Math.max(sol[i-1][j],sol[i-1][j-w[i]]+p[i]);
                else
                    sol[i][j]=sol[i-1][j];
            }
        }
        System.out.println(sol[n][m]);
        //to print values
        int i=n,j=m;
        while(i>0&&j>=0)
        {
            if(sol[i-1][j]==sol[i][j])
            {
                System.out.println(i+" = 0");
                i--;
            }
            else
            {
                System.out.println(i+" = 1");
                j=j-w[i];
                i--;
            }
        }
        
    }
}