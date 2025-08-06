class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n>0){
           int i=n%10;
           sum+=i;
           product*=i;
           n=n/10;
        }
        return (product-sum);
    }
}
