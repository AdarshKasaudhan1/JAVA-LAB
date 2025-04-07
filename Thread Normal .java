//thread in java
class Child extends Thread{//child class
    public void run(){
        System.out.println("this is Infinitive");
    }
}
public class Main {
    public static void main(String[]args){
        Child ak =new Child();

        ak.run();

    }
}
