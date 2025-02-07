interface Fruit {
    void fruitName();
    void fruitShape();
    void fruitColor();
    void fruitPrice();
    void fruitTaste();
    void fruitArea();
}

class Fruit9 implements Fruit {
    String name = "Apple";
    String shape = "Oval";
    String taste = "Sweet";
    String color = "Red";
    String area = "Kashmir";
    int price = 120;

    public void fruitName() {
        System.out.println("Fruit details:");
        System.out.println("--------------------");
        System.out.println("Fruit name is " + name);
    }
    public void fruitShape(){
        System.out.println("Fruit shape is " + shape);
    }
    public void fruitTaste(){
        System.out.println("Fruit taste is " + taste);
    }
    public void fruitColor() {
        System.out.println("Fruit color is " + color);
    }
    public void fruitArea() {
        System.out.println("Maximum production area is " + area);
    }
    public void fruitPrice() {
        System.out.println("Price is " + price + " Rs");
    }
}

public class phal2 {
    public static void main(String[] args) {
        Fruit9 asd = new Fruit9();
        asd.fruitArea();
        asd.fruitArea();
        asd.fruitName();
        asd.fruitPrice();
        asd.fruitTaste();
        asd.fruitShape();
    }
}
