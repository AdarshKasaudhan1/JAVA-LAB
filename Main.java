import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        //fruits.add("apple");
        //fruits.add("mango");
        //fruits.add("banana");
        Scanner ask = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the names of Fruits:(type 'done' to finish) ");
            String Fruits = ask.next();
            if (Fruits.equalsIgnoreCase("done")){
                break;
            }
            fruits.add(Fruits);
        }
        System.out.println("Fruits Name"+fruits);
    }
}
