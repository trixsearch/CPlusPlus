import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write First Number: ");
        int first = scn.nextInt();
        System.out.println("Write Second Number: ");
        int second = scn.nextInt();
        int mul=1;
        for(int i =0;i<second;i++){
            if (first == 0) {
                break;
            }
            mul = mul * first;
        }
        System.out.println(mul);
    }
}
