import java.util.Scanner;
public class Array3userinputwithloop{
  public static void main(String args[]){
    Scanner abesh=new Scanner(System.in);
    double [] number= new double[3];
    for(int i=0;i<3;i++){
      number[i]=abesh.nextDouble();}
    double sum= number[0] + number [1] + number [2] ;
    System.out.println ("Sum is = " +(int) (sum*100)/100.0);
  }}