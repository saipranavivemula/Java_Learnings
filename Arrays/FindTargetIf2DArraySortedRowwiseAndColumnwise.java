import java.util.*;
public class BinarySearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr= {
				{1,4,7},
				{2,5,8},
				{3,6,9}
			};
		System.out.println("Enter target:");
		int target=sc.nextInt();
		System.out.println(Arrays.toString(search(arr,target)));
	}
	public static int[] search(int[][] arr,int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=arr.length-1 && end>=0) {
			if(target==arr[start][end]) {
				return new int[] {start,end}; 
			}
			if(target<arr[start][end]) {
				end--;
			}else {
				start++;
			}
		}
		return new int[] {-1,-1};
	}
}
