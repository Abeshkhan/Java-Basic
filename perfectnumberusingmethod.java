public class perfectnumberusingmethod{
  public static void main(String args[]){
  java.util.Scanner abesh=new java.util.Scanner (System.in);
  System.out.println("how many times");  
  int q=abesh.nextInt();
  for(int i=1;i<=q;i++){
  System.out.println("Enter starting value");
  int a =abesh.nextInt();
  System.out.println("Enter last value");
  int b=abesh.nextInt();
  perfect(a,b);
}
}
public static void perfect(int a,int b){
  while(a<=b){
    int i=1;
    int sum=0;
    while(i<a){
      if(a%i==0){
        sum=sum+i;
      }
      i++;
    }
    if(sum==a){
      System.out.print(a+" ");
    }
    a++;
    
  }
  System.out.println();
}
}

      