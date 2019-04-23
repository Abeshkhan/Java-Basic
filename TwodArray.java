
public class TwodArray {
    public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner (System.in);
    System.out.println("How many row");
    int r=abesh.nextInt();
    System.out.println("How many column");
    int c=abesh.nextInt();
   
    int [] [] array=new int [r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
        array[i][j]=abesh.nextInt();
        
    }
        System.out.println();
    }
    System.out.println("A=");
    for(int i = 0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(" "+array[i][j]);
            
        }
        System.out.println();
    }
    
  
    
}
}