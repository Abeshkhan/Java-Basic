public class multiplication_table{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner(System.in);
    System.out.println("Enter your number");
    int num=abesh.nextInt();
    int mult=0;
    for(int i=1;i<=10;i++){
      System.out.println(num+"X"+i+"="+num*i);
    }}}
      