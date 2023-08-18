import java.util.Scanner;
public class car
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0;i<T;i++)
       {
           int X1=sc.nextInt();
           int X2=sc.nextInt();
           int Y1=sc.nextInt();
           int Y2=sc.nextInt();
           float c=(float)Y1/X1;
           float d=(float)Y2/X2;
           if(c<d)
           {
               System.out.println("-1");
           }
           else if(c>d)
           {
               System.out.println("1");
           }
           else
           {
               System.out.println("0");
           }
       }
   }
    
}