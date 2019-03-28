public class Sumofdigits{
  public static void main(String args[]){
   java.util.Scanner abesh=new java.util.Scanner (System.in);
   System.out.println("Enter number");
   int n=abesh.nextInt();
   int sum=0,temp,r;
   temp=n;
   while (temp!=0){ //until it become 0
     r=temp%10;   // getting the last number 
     sum=sum+r;  // adding it
     temp=temp/10; // dividing so that i can get the new value
   }
   System.out.println("Sum of digits : " +sum);
  }}


