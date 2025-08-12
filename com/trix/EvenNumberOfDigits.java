//1295. Find Numbers with Even Number of Digits (LeetCode)


public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int [] array = {12,345,2,6,7896};
        int [] array1 = {555,901,482,1771};
        System.out.println(findNumbers(array));
    }
    static int findNumbers(int[] nums) {
        int ans =0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            int count =0;
            while(nums[i]>0){
                nums[i]=(nums[i])/10;
                count++;
            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
}
