class Run extends Thread {
    public void run() { // This will be treated as overriding the Thread's run() method
        for (int i = 1; i < 5; i++) {
            System.out.println("Running....." + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Run r = new Run();
        r.start(); // Starts the thread and invokes run()
    }
}
