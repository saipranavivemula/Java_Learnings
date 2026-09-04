/*
11th pattern:
              4 4 4 4 4 4 4
              4 3 3 3 3 3 4
              4 3 2 2 2 3 4
              4 3 2 1 2 3 4
              4 3 2 2 2 3 4
              4 3 3 3 3 3 4
              4 4 4 4 4 4 4
*/
public class Patterns {
	public static void main(String[] args) {
		pattern11(4);
	}
	public static void pattern11(int n) {
		int originaln=n;
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				int atEveryindex=originaln-Math.min(Math.min(j,2*n-j),Math.min(i,2*n-i))+1;
				System.out.print(atEveryindex+" ");
			}
			System.out.println();
		}
	}
}
