/*
	3rd pattern:
 	* * * * *
 	* * * * 
 	* * * 
 	* * 
 	* 
*/
public class Patterns {
	public static void main(String[] args) {
		pattern3(5);
	}
	public static void pattern3(int n) {
		for(int i=0;i<n;i++) {//no of lines the pattern has
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
