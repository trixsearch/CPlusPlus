public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }
    static int fib(int n) {
        int prevsum = 0;
        int nextsum = 1;
        for(int i=0;i<n;i++){
            int temp = prevsum;
            prevsum = nextsum;
            nextsum =nextsum + temp;
        }
        return nextsum;
    }
}
