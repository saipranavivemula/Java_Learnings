/*
	2nd pattern:
	* * * *
	* * * * 
	* * * *
	* * * *
	* * * *
*/
public class Patterns {
	public static void main(String[] args) {
		pattern2(5);
	}
	public static void pattern2(int n) {
		for(int i=0;i<n;i++) {//no of lines the pattern has
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
