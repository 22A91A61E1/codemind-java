import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int C=sc.nextInt();
        int a=0;
        
        for(int i=1;i<=C;i++)
        {
            if(C%i==0)
            {
               a+=1;
            }
            
        }
        if(a==2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
       
    }
}