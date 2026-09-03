/*
7th pattern:
                1
              2 1 2
			      3 2 1 2 3
          4 3 2 1 2 3 4
		    5 4 3 2 1 2 3 4 5
*/
public class Patterns {
	public static void main(String[] args) {
		pattern7(5);
}
public static void pattern7(int n) {
	for(int i=1;i<=n;i++) {
		int totalnoofspaces=n-i;
		for(int s=1;s<=totalnoofspaces;s++) {
			System.out.print("  ");
		}
		for(int j=i;j>=1;j--) {
			System.out.print(j+" ");
		}
		for(int j=2;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
