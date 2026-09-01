import java.util.Scanner;
public class ArrayDemo {
  public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][];
		int arr1[][]= {
				{1,2,3},//row1 has 3 col
				{4,5},//row 2 has 2 col
				{6,7,8,9}//row 3 has 4 col
		};
		System.out.println(arr1[0][2]);
		//For user input
		for(int row=0;row<arr.length;row++) {//for every row 
			int colsize=sc.nextInt();
			arr[row]=new int[colsize];
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=sc.nextInt();
			}
		}
		//output
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();//in order to print in the matrix format
		}
		//print by to string
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		//or else by using for each loop
		for(int[] row:arr) {
			for(int nums:row) {
			System.out.print(nums+" ");
		}
			System.out.println();
		}
	}
}
