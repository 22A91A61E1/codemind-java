import java.util.*;
public class sum
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
        int K=sc.nextInt();
        for(int i=0;i<K;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print(sum+" ");
        
    }
}