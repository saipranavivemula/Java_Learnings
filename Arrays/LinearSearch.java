import java.util.Arrays;
public class LinearSearch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,76,98,33,64};
		System.out.println("Enter the element you want to search:");
		int target=sc.nextInt();
		int ans=linearsearch(arr,target);
		System.out.println("Index= "+ans);
	}
	public static int linearsearch(int arr[],int target) {
		if(arr.length==0)
			return -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
