class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Inside A thread " + i);
        }
        System.out.println("Exiting from thread A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Inside B thread" + j);
        }
        System.out.println("Exiting from thread B");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        A ta = new A();
        B tb = new B();
        ta.start();
        tb.start();
    }
}