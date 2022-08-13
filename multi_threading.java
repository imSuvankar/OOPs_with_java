class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread A with i = " + -1 * i);
        }
        System.out.println("Exiting from Thread A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread B with j = " + 2 * j);
        }
        System.out.println("Exiting from Thread B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("From Thread C with j = " + -2 * k);
        }
        System.out.println("Exiting from Thread C");
    }
}

class multi_threading {
    public static void main(String[] args) {
        System.out.println("Multithreading is staring");

        A a = new A();
        a.start();

        B b = new B();
        b.start();

        C c = new C();
        c.start();

        System.out.println("Multithreading is over");
    }
}
