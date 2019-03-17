public class Factorial {
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("Enter an integer" );
    int inti=abesh.nextInt(); int fact=1;
    for (int i=inti ;i>=1;i--){
      fact=i*fact;}
    System.out.println(fact);
        }}
      
    