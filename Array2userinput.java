import java.util.Scanner;
public class Array2userinput{
  public static void main(String args[]){
    Scanner abesh=new Scanner(System.in);
    double [] number= new double[3];
    System.out.println("Enter 3 numbers");
    number[0]=abesh.nextDouble();
    number [1]=abesh.nextDouble();
    number [2]=abesh.nextDouble();
    double sum= number[0] + number [1] + number [2] ;
    System.out.println ("Sum is = " +(int) (sum*100)/100.0);
  }}