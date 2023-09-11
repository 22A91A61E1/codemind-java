import java.util.Scanner;
public class contest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        if(((A*1)+(B*2))>=X)
        {
            System.out.println("Qualify");
        }
        else
        {
            System.out.println("Not Qualify");
        }
    }
}