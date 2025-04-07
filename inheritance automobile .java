class Vehicle {
    public static void carCompany() {
        System.out.println("TOYOTA");
    }
}

class Car1 extends Vehicle {
    public static void carPrice() {
        System.out.println("INNOVA CRYSTA = 25 lakh");
    }
}

public class Parent3 {
    public static void main(String[] args) {
        Car1.carCompany();
        Car1.carPrice();
    }
}
