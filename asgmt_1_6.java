import java.util.Scanner;

public class asgmt_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int x = sc.nextInt();
        System.out.print("Enter second value : ");
        int y = sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping, First = " + x + " & Seocnd = " + y);
        sc.close();
    }
}