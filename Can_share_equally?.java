import java.util.Scanner;
public class equal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
       if(X%2==0 && (X>0||Y%2==0))
            System.out.printf("YES");
       else
            System.out.printf("NO");
        
    }
}