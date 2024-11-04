
import java.util.*;
public class Main
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s="A1E3";
        int a[]={2,1,-1,-2,2,1,-2,-1};
        int b[]={1,2,2,1,-1,-2,-1,-2};
        int dp[][]=new int[8][8],c=0;
        for(int i=0;i<s.length();i=i+2)
        {
            int col=Integer.parseInt(""+(s.charAt(i)-'A'));
            int row=Character.getNumericValue(s.charAt(i+1)-1);
            for(int j=0;j<a.length;j++)
            {
                // if(col+a[j]>=0&&col+b[j]<8&&row+a[j]>=0&&row+b[j]<8)
                if(col+b[j]>=0&&col+b[j]<8&&row+a[j]>=0&&row+a[j]<8)  
                    dp[row+a[j]][col+b[j]]+=1;
                    // c++;
            }
        }
        int max=0,r=0,cl=0;
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                // System.out.print(dp[i][j]+" ");
                if(dp[i][j]==0)
                    c++;
                else if(dp[i][j]>max)
                {
                    max=dp[i][j];
                    r=i;cl=j;
                }
                else if(dp[i][j]==max)
                    max=-1;
            }
            // System.out.println();
        }
        char ch=(char)(cl+65);
        System.out.println(c+" "+ch+""+(r+1));
        
    }
}