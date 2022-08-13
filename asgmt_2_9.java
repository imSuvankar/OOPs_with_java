class A {
    void show() {
        System.out.println("Inside A");
    }
}

class B extends A {
    void show() {
        System.out.println("Inside B");
    }
}

class C extends A {
    void show() {
        System.out.println("Inside C");
    }
}

public class asgmt_2_9 {
    public static void main(String[] args) {
        System.out.println("test");
        A a=new A();
        B b = new B();
        C c = new C();
        A ref;
        ref = a;
        ref.show();
        ref = b;
        ref.show();
        ref = c;
        ref.show();
    }
}