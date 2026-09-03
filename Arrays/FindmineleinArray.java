import java.util.Arrays;
public class LinearSearch {
	public static void main(String args[]) {
		int arr[]= {10,76,98,33,-64,22,-1};
		System.out.println(min(arr));
	}
	public static int min(int[] arr) {
		if(arr.length==0)
			return -1;
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}	
}
