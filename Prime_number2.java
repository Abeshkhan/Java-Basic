public class prime_number2{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("Enter initial number");
    int s=abesh.nextInt();
    System.out.println ("Enter last number");
    int e=abesh.nextInt();
    int count=0,number=0;
    System.out.println("Prime numbers are:");
    for(int i=s;i<=e;i++){
      for(int j=2;j<=i-1;i++){
        if(i%j==0){
          count++;
          break;
        }
      if(count==0){
        number++;
        System.out.print(i+" ");
      }}
    count=0;}
     System.out.println();
    System.out.println("Total Prime Numbers:"+number);
  }}
      
