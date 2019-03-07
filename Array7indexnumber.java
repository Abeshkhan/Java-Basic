import java.util.Scanner;
public class Array7indexnumber{
  public static void main(String args[]){
    Scanner abesh=new Scanner (System.in);
    double sum=0;
    double[] num=new double[5];
    System.out.println("enter 5 numbers");
    for(int i=0;i<num.length;i++){
      num[i]=abesh.nextDouble();
    }
    for (int i=0;i<num.length;i++){
      sum=sum+num[i];}
    System.out.println("sum is="+sum);
    double min=num[0];
    int index=0;
    for(int i=1;i<num.length;i++){
      if (min>num[i]){
        min=num[i];
        index=i+1;}}
    System.out.println("minimum number is ="+min);
    System.out.println("index number="+index);
  }}
         
    