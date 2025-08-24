// 9. leetcode palindrome number
class PalindromeNumber{
public static void main(String []args){
System.out.print(isPalindrome(121))
}
static boolean isPalindrome(int x) {
        boolean ans=false;
        if (x==0) return true;
        int b=x;
        int a=0;
        while(x>0){
            int temp=x%10;
            a = a*10+(temp);
            x=x/10;
        }
        if (b==a) return ans = true;
        return ans;
    }
}
