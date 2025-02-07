interface Car {
    void start(); //interface method1
    void move(); //interface method2
    void stop();//interface method3
}

class Car7 implements Car { //implement interface class
    public void start() { // implemented method
        System.out.println("*Car movement*");
        System.out.println("...................");
        System.out.println("car is starting......");
    }

    public void move() { // implemented method
        System.out.println("car is moving......");
    }
    public void stop() { // implemented method
        System.out.println("car is stopping......");
    }
}

class Javainterface {
    public static void main(String[] args) {
        Car7 ak = new Car7();
        ak.start();
        ak.move();
        ak.stop();
    }
}
