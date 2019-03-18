public class Fibonacci_number{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner(System.in);
    System.out.println("How Many Number?");
    int n=abesh.nextInt();
    int first=0,second=1,fib;
    System.out.print(first+" "+second);
    for(int i=3;i<=n;i++){
      fib=first+second;
      System.out.print(" "+fib);
      first=second;
      second=fib;
    }}}
    