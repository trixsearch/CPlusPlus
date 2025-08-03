import java.util.Scanner;

public class FactorDivisos {
    public static void main(String[] args) {
        System.out.print("Write a number: ");
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.println("Here are your Factors: ");
        for(int i =2;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
