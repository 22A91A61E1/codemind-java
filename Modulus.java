import java.util.Scanner;
public class num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        long c=a%b;
        System.out.println(c);
    }
}