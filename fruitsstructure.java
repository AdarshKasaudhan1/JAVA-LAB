import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Fruit {
    String name;
    String color;
    String shape;

    Fruit(String name, String color, String shape) {
        this.name = name;
        this.color = color;
        this.shape = shape;
    }


    public String toString() {
        return "Fruit{name=" + name + ", color=" + color + ", shape=" + shape + "}";
    }
}

class fruitsstructure {
    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();
        Scanner ask = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the name of the fruit (type 'done' to finish): ");
            String name = ask.next();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.println("Enter the color of the fruit: ");
            String color = ask.next();

            System.out.println("Enter the shape of the fruit: ");
            String shape = ask.next();

            fruits.add(new Fruit(name, color, shape));
        }

        // To display the entered fruits
        System.out.println("Fruits entered: " + fruits);
    }
}
