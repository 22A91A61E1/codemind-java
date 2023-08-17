import java.util.Scanner;
public class friends
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N>=4 && N<=6)
        {
            System.out.println("Summer");
        }
        else if(N>=7 && N<=10)
        {
            System.out.println("Rainy");
        }
        else if(N>=11 && N<=12)
        {
            System.out.println("Winter");
        }
        else if(N>=2 && N<=3)
        {
            System.out.println("Spring");
        }
        else if(N==1)
        {
            System.out.println("Winter");
        }
        else
        {
            System.out.println("-1");
        }
    }
}