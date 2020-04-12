package yo;

public class patterntwo {
	public static void main(String args[]) {
		java.util.Scanner abesh=new java.util.Scanner (System.in);
		int a=abesh.nextInt();
		for(int i=a;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
