import java.util.*;
public class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int K=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]%K==0)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}