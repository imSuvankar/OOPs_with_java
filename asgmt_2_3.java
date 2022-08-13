abstract class A {
    A() {
        System.out.println("From A");
    }
}

class B extends A {
    B() {
        System.out.println("Call from B");
    }
}

public class asgmt_2_3 {
    public static void main(String[] args) {
        // B ob = new B();
        new B();
    }
}
