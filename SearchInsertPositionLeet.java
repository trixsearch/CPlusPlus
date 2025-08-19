// Search insert position 35 leetcode

class SearchInsertPositionLeet {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        // System.out.println(end);
        int ans = -1;

        while(start<=end){
            int mid=start+((end-start)/2);
            if(nums[mid]==target) return ans=mid;
           else if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target){
            //    System.out.println("paya");
                ans=mid+1;
                start=mid+1;
            }
            // else if(nums[mid]<target && nums[mid]>target) return ans = mid;
        }return ans==-1?0:ans;
    } 
}
