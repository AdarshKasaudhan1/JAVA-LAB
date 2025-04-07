class FruitsDetails {
    public static void fruit() {
        System.out.println("Apple");
    }
}

class Fruit extends FruitsDetails {
    public static void fruitColor() {
        System.out.println("Apple has red color skin");
    }
}

class Fruits extends FruitsDetails {
    public static void fruitShape() {
        System.out.println("Apple has oval shape");
    }
}

class FruitsTaste extends FruitsDetails {
    public static void fruitTaste() {
        System.out.println("Apple has sweet taste");
    }
}

class FruitsPrice extends FruitsDetails {
    public static void fruitPrice() {
        System.out.println("Apple price is 120rs/kg");
    }
}

public class cop {
    public static void main(String[] args) {
        Fruit.fruit();
        Fruit.fruitColor();

        Fruits.fruitShape();
        FruitsTaste.fruitTaste();
        FruitsPrice.fruitPrice();
    }
}
