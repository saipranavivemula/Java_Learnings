import java.util.*;
public class BinarySearch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {0,3,9,66,55,87,101};
		System.out.println("Enter the element you want to search:");
		int target=sc.nextInt();
		int index=binary(arr,target);
		System.out.println("Index="+index);
	}
	public static int binary(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		boolean isasending;
		if(arr[start]<arr[end]) {
			isasending=true;
		}else {
			isasending=false;
		}
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target==arr[mid]) {
				return mid;
			}
			if(isasending) {
				if(target>arr[mid]) {
					start=mid+1;
				}else{
					end=mid-1;
				}
			}else {
				if(target>arr[mid]) {
					end=mid-1;
				}else{
					start=mid+1;
				}
			}
		}
		return -1;
	}
}
