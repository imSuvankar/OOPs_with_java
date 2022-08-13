class constructor {
    constructor(int x, String y) {
        System.out.println(x + ": " + y);
    }
}

public class asgmt_2_2 {
    public static void main(String[] args) {
        new constructor(101, "Abc");
        new constructor(102, "Xyz");

        // constructor ob1 = new constructor(101, "Abc");
        // constructor ob2 = new constructor(102, "Xyz");
    }
}
