// Leetcode 69 sqrt(x)
public class sqrtx {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
        static int mySqrt(int x) {
            int ans=0;
            if(x<=1){
                return x;
            }
            for(int i=1;i<=x/2;i++){
                if((long)i*i<=x){
                    ans=i;
                }
                else break;
            }
            return ans;
        }
}
