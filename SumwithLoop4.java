import java.util.Scanner;
public class SumwithLoop4{
  public static void main(String args[]){ 
    Scanner abesh=new Scanner (System.in); 
    int sum=0;                             
      int a=abesh.nextInt(); 
      int b=abesh.nextInt(); 
    for (int i=a;i<=b;i++){ 
      if(i%2==0){                /*checking its even or not
        sum =sum+i;              printing that particular even number*/
        System.out.println(i);}} 
    System.out.println("Sum="+sum); 
    }}
     