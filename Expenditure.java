import java.util.Scanner;
public class expenditure
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        if((Y*30)<=X)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}