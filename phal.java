/*interface fruit{
    void fruit_name();
    void fruit_shape();
    void fruit_color();
    void fruit_price();
    void fruit_taste();
    void fruit_area();
}
class fruit9 implements fruit{
    public void fruit_name() {
        System.out.println("fruits details " );
        System.out.println("--------------------");
        System.out.println("Fruit name is Apple");
    }
    public void fruit_shape(){
        System.out.println("fruit shape is oval");
    }
    public void fruit_taste(){
        System.out.println(" fruit tase is sweet");
    }
    public void fruit_color() {
        System.out.println(" fruit colour is red");
    }
    public void fruit_area() {
        System.out.println(" maximum production area is Kashmir");
    }
    public void fruit_price() {
        System.out.println("price is 120rs");
    }
}

public class phal {
    public static void main(String[] args) {
       fruit9 asd =new fruit9();
       asd.fruit_area();
       asd.fruit_area();
       asd.fruit_name();
       asd.fruit_price();
       asd.fruit_taste();
       asd.fruit_shape();
    }
}*/
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

public class phal {
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
