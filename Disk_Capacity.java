import java.util.Scanner;
public class just
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=2;
        int tracks=sc.nextInt();
        int sectors=sc.nextInt();
        int blocks=sc.nextInt();
        int memory=512;
        System.out.println(a*tracks*sectors*blocks*memory);
    }
}