// Leetcode 217. Contains Duplicate


public Class ContainsDuplicateLeetCodeSolution{
  public static void main(String[] args){
    int[] arr={1,2,3,4,5,1};
    System.out.print(containsDuplicate(arr));
  }
  static boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> mapp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mapp.containsKey(nums[i])){
                mapp.put(nums[i],mapp.get(nums[i])+1);
            }else{
                mapp.put(nums[i],1);
            }
        }
        for(Integer key:mapp.keySet()){
            if(mapp.get(key)>1){
                return true;
            }
        }
        return false;
    }
}
