import java.util.Scanner;
public class Array5userinputwithloopsumaverage{
  public static void main(String args[])
  {
    double sum=0;
Scanner abesh=new Scanner (System.in);
double []num= new double[3];
for(int i=0;i< num.length;i++){
  num[i]=abesh.nextDouble();}
for (int i=0;i<num.length;i++){
  sum=sum+num[i];}
System.out.println("sum is="+(int)(sum*100)/100.0);
int len=num.length;
double avg=sum/len;
System.out.println("average is ="+avg);
  }}

