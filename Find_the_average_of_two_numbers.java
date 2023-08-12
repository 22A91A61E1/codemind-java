import java.util.Scanner;
public class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float N=sc.nextInt();
        float M=sc.nextInt();
       float c=(N+M)/2;
        System.out.printf("%.4f",c);
    }
}