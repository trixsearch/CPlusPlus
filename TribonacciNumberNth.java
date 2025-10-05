// leetcode 1137. N-th Tribonacci Number

public class TribonacciNumberNth {
    public static void main(String[] args) {
        System.out.println(tribonacci(5));
    }
    static int tribonacci(int n) {
        int first =0;
        int second =0;
        int third=1;
        if(n==0) return 0;
        if(n==1) return 1;
        if (n==2) return third;
        for(int i=2;i<=n;i++){
            int sum=first+second+third;
            first = second;
            second = third;
            third = sum ;
        }
        return third;
    }
}
