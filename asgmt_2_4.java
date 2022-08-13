interface parent {
    int add();
    int mult();
}

class A1 implements parent {
    int x, y;

    A1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() {
        return this.x + this.y;
    }

    public int mult() {
        return this.x * this.y;
    }
}

public class asgmt_2_4 {
    public static void main(String[] args) {
        A1 obj = new A1(5, 6);
        System.out.println(obj.add());
        System.out.println(obj.mult());
    }
}