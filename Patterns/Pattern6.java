/*
6th pattern:
		  *
     * *
	  * * *
	 * * * *
	* * * * *
	 * * * *
	  * * *
	   * *
	    *
*/
public class Patterns {
	public static void main(String[] args) {
		pattern6(5);
	}
	public static void pattern6(int n) {
		for(int i=1;i<=2*n-1;i++) {
			int totalcolineachrow=i>n ? 2*n-i:i;
			int totalnoofspaces=n-totalcolineachrow;
			for(int s=1;s<=totalnoofspaces;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=totalcolineachrow;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
