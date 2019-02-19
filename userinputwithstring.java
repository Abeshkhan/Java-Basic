import java.util.Scanner
 ;
public class userinputwithstring
{
  public static void main(String args[])
  {
    Scanner abesh=new Scanner(System.in);
    System.out.println("Enter name to know about details");
    String name=abesh.nextLine();
    String a="abesh",b="asif";
    if (name.equalsIgnoreCase(a)){
      System.out.println("He is Single");;
    }
    else if (name.equalsIgnoreCase(b)){
      System.out.println("he is taken");}
    else {
      System.out.println("fuck all");
    }
  }}
      