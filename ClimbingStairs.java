//leetcode 70. Climbing Stairs

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    static int climbStairs(int n) {
        int first =0;
        int second =1;
        if(n<=3 )return n;
        for(int i=1;i<=n;i++){
            int temp = first;
            first =second;
            second = temp+second;
        }
        return second;
    }
}
