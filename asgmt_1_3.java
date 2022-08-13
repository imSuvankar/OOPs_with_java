import java.util.Scanner;

public class asgmt_1_3 {

    public static int biggest(int x, int y, int z) {
        if (x > y & x > z)
            return x;
        if (y > x & y > z)
            return y;
        if (z > y & z > y)
            return z;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int y = sc.nextInt();
        System.out.print("Enter third number : ");
        int z = sc.nextInt();
        sc.close();
        System.out.println("Biggest : " + biggest(x, y, z));
    }
}
