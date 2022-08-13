class student2 {
    int roll;
    String name;

    void getData(int x, String y) {
        roll = x;
        name = y;
    }

    void printData() {
        System.out.println(roll + ": " + name);
    }
}

public class asgmt_2_1 {
    public static void main(String[] args) {
        student2 s1 = new student2();
        student2 s2 = new student2();

        s1.getData(101, "Abc");
        s1.printData();

        s2.getData(102, "Xyz");
        s2.printData();
    }
}
