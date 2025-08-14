import java.util.ArrayList;
import java.util.List;

class I1389CreateTargetArrayintheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
      int len = nums.length;
      int[] arr = new int[len] ;
      List<Integer> list = new ArrayList<Integer>(len);
      for(int i =0;i<len;i++){
        int j = index[i];
        list.add(j,nums[i]);
      }
      for(int i=0;i<len;i++){
        arr[i]=list.get(i);
      }
      return arr;
    }
}
