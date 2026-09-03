/*
8th pattern:
               1
              212
			 32123
            4321234
		   543212345
		    4321234
		     32123
		      212
		       1
*/
public class Patterns {
	public static void main(String[] args) {
		pattern8(5);
}
public static void pattern8(int n) {
	for(int i=1;i<=2*n-1;i++) {
		int totalnoofcols=i>n?2*n-i:i;
		int totalnoofspaces=n-totalnoofcols;
		for(int s=1;s<=totalnoofspaces;s++) {
			System.out.print(" ");
		}
		for(int j=totalnoofcols;j>=1;j--) {
			System.out.print(j);
		}
		for(int j=2;j<=totalnoofcols;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
