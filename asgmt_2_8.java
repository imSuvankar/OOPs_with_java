public class asgmt_2_8 {

    asgmt_2_8() {
        System.out.println("Default constructor");
    }

    asgmt_2_8(int a) {
        System.out.println("Constructor with one parameter: " + a);
    }

    asgmt_2_8(int a, int b) {
        System.out.println("Constructor with two parameter: " + a + " & " + b);
    }

    public static void main(String[] args) {
        new asgmt_2_8();
        new asgmt_2_8(5);
        new asgmt_2_8(10, 20);
    }
}