//Synchronization 
class Printer { // Parent class
    synchronized void message(String message) {
        System.out.print("[" + message);

        try {
            Thread.sleep(1000); // Pause for 1 second
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("]");
    }
}

class MyThread extends Thread { // Child class or thread class
    Printer print_message;
    String msg;

    MyThread(Printer print_message, String msg) {
        this.print_message = print_message;
        this.msg = msg;
    }

    public void run() {
        print_message.message(msg); // Call synchronized method
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Printer ak = new Printer();

        // Create threads and pass the Printer instance
        MyThread ask = new MyThread(ak, "hello");
        MyThread ask1 = new MyThread(ak, "Good Morning");
        MyThread ask2 = new MyThread(ak, " Afternoon");
        MyThread ask3 = new MyThread(ak, " Evening");
        MyThread ask4 = new MyThread(ak, " Night");

        // Start threads
        ask.start();
        ask1.start();
        ask2.start();
        ask3.start();
        ask4.start();
    }
}
