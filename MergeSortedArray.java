import java.util.Arrays;
// Leetcode 88. Merge Sorted Array(sorting , Binary search)

class MergeSortedArray{
  public static void main(String[] args){
    int[] nums1={1,2,3,0,0,0};
    int[] nums2={2,5,6};
    int m=3;
    int n = 3;
  }
  static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i =m;i<m+n;i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}
