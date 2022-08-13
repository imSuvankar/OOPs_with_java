import java.util.Scanner;

public class asgmt_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0)
                    count += 1;
            }
            if (count == 2)
                System.out.println(i);
        }
    }
}