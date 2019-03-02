public class BreakContinueDemo {
  public static void main(String args[]){
    for(int i=1;i<=20;i+=3){
      if(i==10){
        continue ;}
      if (i>13){
      break;}
    
      System.out.println(i);}
  }}