import java.util.Scanner;
public class ArrayDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>(10);
		// to add ele in the list
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		//input using loop
		for(int i=3;i<8;i++) {
			list.add(sc.nextInt());
		}
		for(int i=3;i<8;i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println(list.contains(3));
		//to update the ele
		list.set(0, 11);
		list.remove(1);
		System.out.println(list);
	}
}
