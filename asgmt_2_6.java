class Student {
    private static int Object_Counter = 0; // Q.2
    Student() {
        Object_Counter += 1;
        int Enrollment_No = Object_Counter;
        System.out.println("\nTotal Objects: " + Enrollment_No);
    }

    protected int age; // Q.1
    void validate(int a) {
        if (a >= 4 && a <= 40) {
            System.out.println("Age is " + a);
            age = a;
        } else
            System.out.println("Age not valid");
    }

    protected void finalize() { // Q.3
        Object_Counter -= 1;
        System.out.println("Object removed as finalize() called.");
    }
    static void display() {
        System.out.println("\nTotal Objects (in static): " + Object_Counter);
    }
}


public class asgmt_2_6 extends Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.validate(10);
        s1.finalize();
        
        Student s2 = new Student();
        s2.validate(30);
        s2.finalize();

        Student s3 = new Student();
        Student s4 = new Student();

        s4.display();
        display();
    }
}