public class EvenOddSum {
    public static void main(String[] args) {
        int num = 1234;
        int evenSum = 0;
        int oddSum = 0;
        while(num>0){
            int a=num%10;
            if(a%2==0){
                evenSum=evenSum+a;
            }
            else{
                oddSum=oddSum+a;
            }
            num = num/10;
        }
        System.out.println(evenSum+" "+oddSum);
    }
}
