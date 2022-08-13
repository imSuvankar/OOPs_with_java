abstract class Vehicle {
    void engine() {
        System.out.println("This vehicle has engine.");
    }
}

class Car extends Vehicle {
    void engine() {
        System.out.println("Car has good engine.");
    }
}

class Truck extends Vehicle {
    void engine() {
        System.out.println("Truck has good engine.");
    }
}

public class asgmt_2_5 {
    public static void main(String[] args) {
        Car ob1 = new Car();
        ob1.engine();
        Truck ob2 = new Truck();
        ob2.engine();
    }
}
