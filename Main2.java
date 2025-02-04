abstract class Animal{
    public abstract void sound();
}
class dog extends Animal{
    public void sound(){
        System.out.println("Dog Name: shiro");
        System.out.println("Dog Bread: German Shephard");
        System.out.println("Dog Price: 50k");
        System.out.println("Dog Location:NEPAL");
        System.out.println("Dog Owner:Adarsh kumar gupta kasaudhan");
        System.out.println("BOW BOW.....!");
    }
}
class cat extends Animal{
    public void sound(){
        System.out.println("meow  mewo...!");
    }
}
public class Main2 {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.sound();

        cat obj2 = new cat();
        obj2.sound();

    }
}





/*abstract class Animal{
    public abstract void sound();
    }
 class dog extends Animal{
    public void sound(){
        System.out.println("this method is converted into adstract from normal ");
    }
}
public class Main2 {
    public static void main(String[] args){
        dog obj= new dog();
        obj.sound();
    }
}*/
