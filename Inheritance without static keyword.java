class Fruits_details {
    public void fruit() {
        System.out.println("Apple");
    }
}

class Fruit1 extends Fruits_details {
    public void fruit_color() {
        System.out.println("Apple has red color skin");
    }
}

class Fruit2 extends Fruits_details {
    public void fruit_shape() {
        System.out.println("Apple has oval shape");
    }
}

class Fruit3 extends Fruits_details {
    public void fruit_Taste() {
        System.out.println("Apple has Sweet Taste ");
    }
}

class Fruit4 extends Fruits_details {
    public void fruit_Price() {
        System.out.println("Apple Price is 120rs/kg");
    }
}

public class parent4 {
    public static void main(String[] args) {
        Fruit1 obj = new Fruit1();
        obj.fruit();
        obj.fruit_color();

        Fruit2 fruitShape = new Fruit2();
        fruitShape.fruit_shape();

        Fruit3 fruitTaste = new Fruit3();
        fruitTaste.fruit_Taste();

        Fruit4 fruitPrice = new Fruit4();
        fruitPrice.fruit_Price();
    }
}

