import java.util.Arrays;
public class Sorting {
  public static void main(String[] args) {
	  int[] arr= {-3,-45,45,0};
	  selectionsort(arr);
	  System.out.println(Arrays.toString(arr));
  }
  public static void selectionsort(int[] arr) {
	  for(int i=0;i<arr.length;i++) {
		  //find the max ele and swap it with the max element
		  int lastidx=arr.length-i-1;
		  int maxidx=getmax(arr,0,lastidx); 
		  swap(arr,maxidx,lastidx);
	  }
  }
  public static int getmax(int arr[],int startidx,int lastidx) {
	  int max=startidx;
	  for(int i=startidx;i<=lastidx;i++) {
		  if(arr[max]<arr[i])
			  max=i;
	  }
	  return max;
  }
  public static void swap(int arr[],int maxidx,int lastidx) {
	  int temp=arr[maxidx];
	  arr[maxidx]=arr[lastidx];
	  arr[lastidx]=temp;
  }
}
