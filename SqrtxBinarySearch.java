//sqrtx leetcode with binary search

public class SqrtxBinarySearch {
    public static void main(String[] args){
        System.out.println("sqrt number will be: "+mySqrt(2147395599));
    }
    static int mySqrt(int x) {
        int start=1;
        int end=x-1;
        int ans=0;
        if(x<2) return ans=x;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(mid*mid==x) return ans=mid;
            else if(mid*mid>x){
                end=mid-1;
            }
            else if(mid*mid<x){
                if((mid+1)*(mid+1)>x) return ans=mid;
                start=mid+1;
            }
        }return ans;
    }
}
