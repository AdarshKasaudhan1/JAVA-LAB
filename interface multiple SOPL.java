
interface vehicles2{//interface method
    void  vehicles_details();//interface method or abstract class
}
class Car2 implements vehicles2 {//implementatiom class
    public void vehicles_details() {
        System.out.println("Vehicles Details 1");
        System.out.println("****************");
        System.out.println("Car company= TOYOTA");
        System.out.println("Car Price= 25lac");
        System.out.println("Car Name= INNOVA CRYSTA");
        System.out.println("Car Owner= ADARSH KASAUDHAN");
        System.out.println("Location= NEPAL");
    }
}
interface vehicles3{
    void vehicles_details3();
}
class Car3 implements vehicles3{
    public void vehicles_details3() {
        System.out.println("--------------");
        System.out.println("Vehicles Details 2");
        System.out.println("****************");
        System.out.println("Car company= HONDA");
        System.out.println("Car Price= 25lac");
        System.out.println("Car Name= CIVIC");
        System.out.println("Car Owner= PRAKAHR KASAUDHAN");
        System.out.println("Location= NEPAL");
    }
}
class interfacaemulti{
    public static void main(String[]args){
        Car2 ak = new Car2();
        ak.vehicles_details();
        Car3 ask= new Car3();
        ask.vehicles_details3();
    }
}
