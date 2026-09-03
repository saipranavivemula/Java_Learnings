/*
 	1st pattern:
 	*
 	* *
 	* * *
 	* * * *
 */
public class Patterns {
	public static void main(String[] args) {
		pattern1(4);
	}
	public static void pattern1(int n) {
		for(int i=0;i<n;i++) {//no of lines the pattern has
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
