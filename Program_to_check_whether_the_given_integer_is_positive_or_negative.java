import java.util.Scanner;
public class program
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       if(N<0)
       {
           System.out.print("Negative Number");
       }
       else
       {
           System.out.print("Positive Number");
       }
    }
}