public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
    int [] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }return count;
    }
}
