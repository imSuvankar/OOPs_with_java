class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread A with i = " + -1 * i);
        }
        System.out.println("Exiting from Thread A");
    }
}

class B implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread B with j = " + 2 * j);
        }
        System.out.println("Exiting from Thread B");
    }
}

class C implements Runnable {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("From Thread C with j = " + -2 * k);
        }
        System.out.println("Exiting from Thread C");
    }
}

public class thread_runnable {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        
        B b = new B();
        Thread t2 = new Thread(b);
        
        C c = new C();
        Thread t3 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Multithreading is over");
    }
}
