import java.util.Scanner;

class swapValue {
    public void swap(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("First = " + x + " & Seocnd = " + y);
    }
}

public class asgmt_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int x = sc.nextInt();
        System.out.print("Enter second value : ");
        int y = sc.nextInt();
        swapValue ob = new swapValue();
        ob.swap(x, y);
        sc.close();
    }
}
