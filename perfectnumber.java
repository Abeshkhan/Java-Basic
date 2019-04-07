public class perfectnumber{
  public static void main(String args[]){
  java.util.Scanner abesh=new java.util.Scanner (System.in);
  System.out.println("Enter a number");
    int a=abesh.nextInt();
    int sum=0;
    for(int i=1;i<a;i++){
      if(a%i==0){
        sum=sum+i;
      }
    }
    if(sum==a){
      System.out.println("perfect number");}
    else
      System.out.println("not a perfect number");
  }}
  