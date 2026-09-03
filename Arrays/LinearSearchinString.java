import java.util.Arrays;
public class LinearSearch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str= "Sai Pranavi";
		System.out.println("Enter the char you want to search:");
		char target=sc.next().trim().charAt(0);
		boolean ans=linearsearch(str,target);
		System.out.println(ans);
	}
	public static boolean linearsearch(String str,int target) {
		if(str.length()==0)
			return false;
		for(int ch:str.toCharArray()) {
			if(ch==target)
				return true;
		}
		return false;
	}
}
