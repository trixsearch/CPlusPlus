public class BinarySearchLeetRawNLeetcode {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(binary(arr,5));
    }
    static int binary(int[]nums,int target){
        int start=0;
        int end = nums.length-1;
        while(start<=end) {
            // for finding mid element
//            int mid= start+end/2; // This formula exceeds int range limits sometimes
            // we got new formula instead
            int mid = start+((end - start) / 2);
            if(nums[mid]==target) return mid;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }return -1;
    }
}
