public class CalsiusToFahrenheit{
  public static void main(String args []){
    java.util.Scanner abesh=new java.util.Scanner(System.in);
    System.out.println("celsius : ");
    double c=abesh.nextDouble();
    float o=9/5f;
    double f=(o*c)+32; // for f to c 5/9f+32
    System.out.println("Fahrenheit : "+f);
  }}