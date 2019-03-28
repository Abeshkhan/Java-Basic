public class AreaandPerimeter{
  public static void main(String args[]){
    java.util.Scanner abesh= new java.util.Scanner(System.in);
    System.out.println("Enter length of side to know about the area and perimeter of square");
      double s=abesh.nextDouble();
    double a=Math.pow(s,2);
    double p=4*s;
    System.out.println("Area of square is : " +a );
    System.out.println("Perimeter of sqare is : " +p);//done with square
    System.out.println("Enter length and width to know about the area and perimeter of Rectangle"); 
    double [] lw= new double [2]; // new array for rectangle
    for(int i=0;i<lw.length;i++){ //getting width and length
    
    lw[i]=abesh.nextDouble();}
    
    double ar=lw[0]*lw[1];
    double pe=2*(lw[0]+lw[1]);
     System.out.println("Area of Rectangle is : " +ar );
     System.out.println("perimeter of Rectangle is : " +pe );//done with rectangle
     System.out.println("Enter base and height to know about the area of Triangle");
     double [] bh= new double [2];//array for triangle
     for(int i=0;i<bh.length;i++){//getting base and height
     
     bh[i]=abesh.nextDouble();}
     double are = 0.5*bh[0]*bh[1];
     System.out.println("Area of Triangle is : " +are );//done with triangle
     System.out.println("Enter radius number know about the area and perimeter of Circle");
     double radius=abesh.nextDouble();
     double area=Math.PI*Math.pow(radius,2);
     double perimeter = 2*Math.PI*radius;
     System.out.println("Area of Circle is : "+area);
     System.out.println("Perimeter of circle is : " +perimeter );
  }
}
     
     
    
    
     