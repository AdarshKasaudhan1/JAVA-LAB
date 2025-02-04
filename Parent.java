// Super or parent class
class Parent12 {
    public static void parent1() {
        System.out.println("This is the parent class");
    }
}

// Subclass or child class
class Child extends Parent12 {
    public static void child1() {
        System.out.println("This is the child class");
    }
}

public class Parent {
    public static void main(String[] args) {


        Child  obj = new Child();
      obj.child1();
      obj.parent1();
    }
}
