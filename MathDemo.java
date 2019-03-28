public class MathDemo{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
  int x=abesh.nextInt(); // getting a number
  int y=abesh.nextInt();
  int max=Math.max(x,y);
  System.out.println(max+ " is maximum" );
  int min=Math.min(x,y);
  System.out.println(min+ " is minimum");
  int abs=Math.abs(x);
  System.out.println(abs+ " absolute value ");
  int round =Math.round(5.5f);
  System.out.println(+round);}}