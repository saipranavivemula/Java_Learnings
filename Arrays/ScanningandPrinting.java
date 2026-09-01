import java.util.Scanner;
public class ArrayDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		//System.out.println(arr[5]);//index out of bound error
		//or
		int[] arr1= {5,5,3,2,1};
		int[] arr2=new int[5];
		//or Input using for loop
		System.out.println("Enter elements:");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		//for printing
		System.out.println("The elements are:");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
  }
}
