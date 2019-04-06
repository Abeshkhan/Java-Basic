public class palindrome_number{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("Enter your number");
    int a=abesh.nextInt();
    int sum=0,temp,r;
    temp=a;
    while(temp!=0){
      r=temp%10;
      sum=sum*10+r;
      temp=temp/10;
    }
    if(a==sum){
    System.out.println("number is palindrome");
    }
    else
      System.out.println("number is not palindrome ");
    
  }
}