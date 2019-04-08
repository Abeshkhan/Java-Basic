public class pattern1{
  public static void main (String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("Enter number");
    int a =abesh.nextInt();
    for(int row=1;row<=a;row++){
      for(int col=1;col<=row;col++){
        System.out.print("*");
      }
      System.out.println();
    }
  }}