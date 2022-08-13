import java.util.Scanner;

public class asgmt_1_1 {

    public static int fact(int n) {
        if (n <= 1)
            return n;
        else
            return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.printf("%d! = %d\n", n, fact(n));
        sc.close();
    }
}