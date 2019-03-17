public class Prime_Number{
  public static void main(String args[]){
    java.util.Scanner abesh =new java.util.Scanner (System.in);
    System.out.println("Ebter any positive integer ");
    int num=abesh.nextInt();
    int count=0;
    for(int i=2;i<num;i++){
      if(num%i==0){
        count++;
        break;
      }}
      if(count==0){
        System.out.println(num+" is a prime number");}
else{
  System.out.println(num+" is not a prime number");}
}}