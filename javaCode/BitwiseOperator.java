public class BitwiseOperator {
	public static void main(String[] args) {
		int a=5;
		int b=3;
//		System.out.println(Integer.toBinaryString(a));
//		System.out.println(Integer.toBinaryString(b));
		// And Operator
		System.out.println(a&b);
		// OR operator
		System.out.println(a|b);
		// xor Operator
		System.out.println(a^b);
		//Not Operator
		System.out.println(~a);
		// Left Shift
		System.out.println(a<<1);
		// Right Shift
		System.out.println(a>>1);
	}
}
