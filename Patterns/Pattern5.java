/*
5th pattern:
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
		pattern5(5);
	}
	public static void pattern5(int n) {
		for(int i=1;i<=2*n-1;i++) {
			int totalcolineachrow=i>n ? 2*n-i:i;
			for(int j=1;j<=totalcolineachrow;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
