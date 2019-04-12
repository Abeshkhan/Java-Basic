public class perfectnumber2{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("Enter First Number ");
    int a=abesh.nextInt();
    System.out.println("Enter last number");
    int b=abesh.nextInt();
    int sum=0;
    System.out.println("perfect numbers are :");
    for(int i=a;i<=b;i++){
      for(int j=1;j<i;j++){
        if(i%j==0){
          sum=sum+j;
        }
      }
      if(sum==i){
        System.out.print(i+" ");
      }
      sum=0;
    }
  }
}
  