import java.util.Scanner;

public class asgmt_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(n + "! = " + result);
    }
}