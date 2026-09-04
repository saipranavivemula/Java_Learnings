/*
 9th pattern
4 4 4 4 4 4 4 4 4 
4 3 3 3 3 3 3 3 4 
4 3 2 2 2 2 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 1 0 1 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 2 2 2 2 3 4 
4 3 3 3 3 3 3 3 4 
4 4 4 4 4 4 4 4 4 
 */
public class Patterns {
	public static void main(String[] args) {
		pattern9(4);
	}
	public static void pattern9(int n) {
		int originaln=n;
		for(int i=0;i<=2*n;i++) {
			for(int j=0;j<=2*n;j++) {
				int atEveryindex=originaln-Math.min(Math.min(j,2*n-j),Math.min(i,2*n-i));
				System.out.print(atEveryindex+" ");
			}
			System.out.println();
		}
	}
}
