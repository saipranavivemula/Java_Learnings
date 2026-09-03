import java.util.Arrays;
public class Sorting {
public static void main(String[] args) {
	int[] arr= {4,2,1,3,2};
	int ans=cyclicsort(arr);
	System.out.println(ans);
}
public static int cyclicsort(int[] arr) {
	int i=0;
	while(i<arr.length) {
		if(arr[i]!=i+1) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				return arr[i];
			}
		}else {
			i++;
		}
	}
	return -1;
}
public static void swap(int arr[],int idx1,int idx2) {
	int temp=arr[idx1];
	arr[idx1]=arr[idx2];
	arr[idx2]=temp;
}
}
