class ID extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

public class thread_getID {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            ID obj = new ID();
            obj.start();
        }
    }    
}
