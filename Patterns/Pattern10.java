/*
10th pattern:
	index:     0 1 2 3 4 5 6 7 8
    0          0 0 0 0 0 0 0 0 0
    1          0 1 1 1 1 1 1 1 0
    2          0 1 2 2 2 2 2 1 0
    3          0 1 2 3 3 3 2 1 0
    4          0 1 2 3 4 3 2 1 0
    5          0 1 2 3 3 3 2 1 0
    6          0 1 2 2 2 2 2 1 0
    7          0 1 1 1 1 1 1 1 0
    8          0 0 0 0 0 0 0 0 0
*/
public class Patterns {
	public static void main(String[] args) {
		pattern10(4);
	}
	public static void pattern10(int n) {
		for(int i=0;i<=2*n;i++) {
			for(int j=0;j<=2*n;j++) {
				int atEveryindex=Math.min(Math.min(j,2*n-j),Math.min(i,2*n-i));
				System.out.print(atEveryindex+" ");
			}
			System.out.println();
		}
	}
}
