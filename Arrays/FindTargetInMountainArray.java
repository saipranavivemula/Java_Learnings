import java.util.*;
public class BinarySearch{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,1,0};
		System.out.print("Enter the target element:");
		int target=sc.nextInt();
		System.out.println("Ans= "+ search(arr,target));
	}
	public static int search(int[] arr,int target) {
		int peek=findPeakElement(arr);
		int asssearch=binary(arr,target,0,peek);
		if(asssearch!=-1) {
			return asssearch;
		}
		//try to search in the second half
		int dessearch=binary(arr,target,peek+1,arr.length-1);
		return dessearch;
	}
   public static int findPeakElement(int[] arr) {
       int start=0;
       int end=arr.length-1;
		while(start<end) {
			int mid=start+((end-start)/2);
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}else{
				start=mid+1;
			}
		}
		return start;
   }
	public static int binary(int[] arr,int target,int start,int end) {
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
