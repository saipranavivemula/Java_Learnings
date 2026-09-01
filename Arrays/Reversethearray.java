import java.util.Scanner;
public class ArrayDemo{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		swap(arr,0,3);
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(int[] arr,int s,int e) {
		while(e>s) {
		  int temp=arr[s];
		  arr[s]=arr[e];
		  arr[e]=temp;
		  s++;
		  e--;
		}
	}
}
