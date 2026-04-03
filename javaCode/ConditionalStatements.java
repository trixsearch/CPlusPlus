public class ConditionalStatements {
	public static void main(String[] args) {
		int a=14;
		if(a%2==0) {
			System.out.println("Even");
		}
		else System.out.println("Odd");
		
		// Ternary operator
		
		String isEvenOddString = a%2==0 ? "Even" : "Odd" ;
		System.out.println(isEvenOddString);
	}
}
