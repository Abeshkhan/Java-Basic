public class Armstrong_Number{
public static void main(String args[]){
  java.util.Scanner abesh=new java.util.Scanner(System.in);
  System.out.println("Enter a number");
  int a =abesh.nextInt();
  int sum=0,r,temp;
  temp=a;
  while(temp!=0){
    r=temp%10;
    sum=sum+r*r*r;
    temp=temp/10;
  }
  if(sum==a){
    System.out.println("the number was an armstrong number");
  }
  else
    System.out.println("The number was not an armstrong number");
}
}