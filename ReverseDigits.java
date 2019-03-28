public class ReverseDigits{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
      System.out.println("Enter number");
      int num=abesh.nextInt();
      int sum=0,r,temp;
      temp=num;
      while(temp!=0){
        r=temp%10;
        sum=sum*10+r;
        temp=temp/10;
      }
    System.out.println(" Reverse of digitis : "+sum);
    }
}

        
