public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={3,2,2,3};
        System.out.println(removeElement(arr,3));
    }
    static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int[] arr = new int[len];
        int n=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                arr[n]=val;
                n+=1;
            }

        }
        return n;
    }
}
