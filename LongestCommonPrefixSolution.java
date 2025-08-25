// 14. Longest Common Prefix leetcode solution


class LongestCommonPrefixSolution{
public static void main(String[] args){
  strs = {"flower","flow","flight"};
  longestCommonPrefix(strs);
}
  
  static String longestCommonPrefix(String[] strs) {
        String ans ="";
        for(int i=0;i<strs[0].length();i++){ 
            boolean flag=false;
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||strs[0].charAt(i)!=strs[j].charAt(i)){
                    flag = true;
                    break;
                } 
            }
            if (flag){
                break;
            }
            else{
                ans = ans + strs[0].charAt(i);
            }
        }
        return ans;
    }
}
