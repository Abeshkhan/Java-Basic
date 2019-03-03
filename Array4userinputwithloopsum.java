import java.util.Scanner;
public class Array4userinputwithloopsum{
  public static void main(String args[]){
    double sum=0;
    Scanner abesh=new Scanner(System.in);
    double [] number= new double[3];
    for(int i=0;i<3;i++){
      number[i]=abesh.nextDouble();}
    for (int i=0;i<=2;i++){
      sum= sum + number[i];
    }
   
    System.out.println ("Sum is = " +(int) (sum*100)/100.0);
  }}