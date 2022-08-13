import java.util.Scanner;

public class asgmt_1_4 {
    public static void main(String[] args) {
        int first = 0, sec = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.println(first);
            int next = first + sec;
            first = sec;
            sec = next;
        }
    }
}