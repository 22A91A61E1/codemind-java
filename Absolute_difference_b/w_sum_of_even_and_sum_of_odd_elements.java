import java.util.*;
public class diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int diff=0;
        for(int i=0;i<N;i++)
        {
            if((arr[i]%2)==0)
            {
               sum=sum+arr[i]; 
            }
            else
            {
                diff=diff+arr[i];
            }
            //System.out.println(Math.abs(sum-diff));
        }
        System.out.println(Math.abs(sum-diff));
    }
}