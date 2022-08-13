import java.util.Scanner;

public class asgmt_1_8 {

    public static int fact(int n) {
        if (n <= 1)
            return n;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int n = sc.nextInt();
        sc.close();

        double result = 0;
        for (int i = 1; i <= n; i++)
            result += 1 / (double) fact(i);

        System.out.println("Result = " + result);
    }
}