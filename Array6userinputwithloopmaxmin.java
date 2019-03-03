import java.util.Scanner;
public class Array6userinputwithloopmaxmin{
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
double avg=sum/num.length;
System.out.println("average is ="+avg);
double max=num[0];
for(int i=1;i<num.length;i++){
  if(max<num[i]){
    max=num[i];}}
System.out.println("maximum number is="+max);
double min=num[0];
for(int i=1;i<num.length;i++){
  if(min>num[i]){
    min=num[i];}}
System.out.println("minimum number is = " +min);
  }}

