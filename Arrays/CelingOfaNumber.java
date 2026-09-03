import java.util.*;
public class BinarySearch {
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  int[] arr= {1,4,6,9,12,22,34,45,67,88};
  System.out.println("Enter the element you want to search:");
  int target=sc.nextInt();
  int index=binary(arr,target);
  System.out.println("ele="+index);
  }
  public static int binary(int[] arr,int target) {
  if(target>arr[arr.length-1]){
    return -1;
  }
  int start=0;
  int end=arr.length-1;
  while(start<=end) {
	  int mid=start+((end-start)/2);
	  if(target>arr[mid]) {
		  start=mid+1;
	  }else if(target<arr[mid]) {
		  end=mid-1;
	  }else {
		  return mid;
	  }
  }
  return start;
  }
}
