import java.util.Scanner;
public class ifelse
{
    public static void main (String[] args)
    {
        Scanner abesh=new Scanner (System.in);
        int a, b;
        System.out.println ("Enter a number");
        a=abesh.nextInt();
        System.out.println ("Enter another number");
        b=abesh.nextInt();
        if (a>b)
        {
            System.out.println("first is greater");
        }
        else
        {
            System.out.println("first is not greater");
        }
    }
}    