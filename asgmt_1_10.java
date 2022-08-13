import java.util.Scanner;

public class asgmt_1_10 {
    public static void main(String[] args) {
        System.out.print("Enter month number: ");
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        sc.close();

        if (1 <= mon & mon <= 4)
            System.out.println("This is Summer");
        else if (5 <= mon & mon <= 8)
            System.out.println("This is Rainy");
        else if (9 <= mon & mon <= 12)
            System.out.println("This is Winter");
        else
            System.out.println("Enter a valid month");
    }
}