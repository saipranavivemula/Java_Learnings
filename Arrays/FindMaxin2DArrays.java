import java.util.Arrays;
public class LinearSearch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		int max=max2d(arr);
		System.out.println("MAXVALUE= "+max);
	}
	public static int max2d(int[][] arr) {
		int max=arr[0][0];
		for(int row=0;row<arr.length;row++) {
			for(int column=0;column<arr[row].length;column++) {
				if(arr[row][column]>max) {
					max=arr[row][column];
				}
			}
		}
		return max;
	}
}
