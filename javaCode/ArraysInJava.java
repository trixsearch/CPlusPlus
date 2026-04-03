import java.util.Iterator;

public class ArraysInJava {
	public static void main(String[] args) {
//		int[] arr= new int[5];
		int[]arr = {1,2,3,4,5,6};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(int num:arr) {
			System.out.println(num);
		}
	}
}
