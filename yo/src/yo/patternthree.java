package yo;

public class patternthree {
	public static void main(String args[]) {
		java.util.Scanner abesh=new java.util.Scanner (System.in);
		int a=abesh.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		for(int i=a-1;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		}

}
