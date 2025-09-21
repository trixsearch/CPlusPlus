public class BinarySearchLeetRawNLeetcode {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(binary(arr,5));
    }
    static int binary(int[]nums,int x){
        int start=1;
        int end=x/2;
        int ans=0;
        if(x<2) return x;
        while(start<=end){
            int mid=start+((end-start)/2);
            long sq = (long)mid*mid;
            if(sq==x) return ans=mid;
            else if(sq<x){
                ans= mid;
                start=mid+1;
            }
            else if(sq>x){
                end=mid-1;
            }

        }return ans;
        //skjfosfoi
    }
}
