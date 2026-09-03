import java.util.Arrays;
public class Sorting {
  public static void main(String[] args) {
	  int[] arr= {};
	  insertionsort(arr);
	  System.out.println(Arrays.toString(arr));
  }
  public static void insertionsort(int[] arr) {
	  for(int i=0;i<arr.length-1;i++) {
		  for(int j=i+1;j>0;j--) {
			  if(arr[j]<arr[j-1]) {
				  swap(arr,j,j-1);
			  }else {
				  break;
			  }
		  }
	  }
  }
  public static void swap(int arr[],int maxidx,int lastidx) {
	  int temp=arr[maxidx];
	  arr[maxidx]=arr[lastidx];
	  arr[lastidx]=temp;
  }
}
