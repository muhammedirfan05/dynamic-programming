import java.util.*;
public class CanSum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int target=sc.nextInt();
        Boolean b[]=new Boolean[target+1];
        Arrays.fill(b, false);
        b[0]=true;
        for(int i=0;i<=target;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+a[j])<=target&&b[i])  
                    b[i+a[j]]=true;
            }
        }
        if(b[target])   System.out.println("true");
        else    System.out.println("false");
        sc.close();
    }
}
