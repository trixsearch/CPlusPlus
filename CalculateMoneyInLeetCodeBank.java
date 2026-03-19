public class CalculateMoneyInLeetCodeBank {
    public static void main(String[] args) {
        System.out.println(totalMoney(4));
    }
    public static int totalMoney(int n) {
        boolean check;
        int start=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            int temp=start;
            start=start+1;
            sum=start+temp+1;
        }
        return sum;
    }

}