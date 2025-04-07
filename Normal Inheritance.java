//parent or super class
class Animal{
    public static void dog(){
        System.out.println("Dog is a Domestic Animal");
    }
}

//child or Sub class
class Behaviour extends Animal{
    public static void Eat(){
        System.out.println("Dog eats Pedigree");
    }
}
public class parents2 {
    public static void main(String[] args) {
        Behaviour.Eat();
        Behaviour.dog();
    }
}
