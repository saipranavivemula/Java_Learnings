import java.util.*;
public class BinarySearch{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {2,3,4,6,8,12,18,22,45,89,99};
		System.out.println("Enter the target:");
		int target=sc.nextInt();
		System.out.println(ans(arr,target));
	}
	public static int ans(int arr[],int target) {
		int start=0;
		int end=1;
		while(target>arr[end]) {
			int newStart=end+1;//why new var bcz in end we need old start value so to use that we keep in new var
			end=end+(end-start+1)*2;
			start=newStart;
		}
		return binary(arr,target,start,end);
	}
	public static int binary(int[] arr,int target,int start,int end) {
		while(start<=end) {
			//int mid=(start+end)/2;
			int mid=start+((end-start)/2);
			if(target>arr[mid]) {
				start=mid+1;
			}else if(target<arr[mid]) {
				end=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
