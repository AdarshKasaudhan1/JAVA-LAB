//multiple interfaces
interface vehicles{//interface method
    void  vehicles_details();//interface method or abstract class
    void vehicles_details2();
}
class Car1 implements vehicles{//implementatiom class
    public void vehicles_details(){
        System.out.println("Vehicles Details 1");
        System.out.println("****************");
        System.out.println("Car company= TOYOTA");
        System.out.println("Car Price= 25lac");
        System.out.println("Car Name= INNOVA CRYSTA");
        System.out.println("Car Owner= ADARSH KASAUDHAN");
        System.out.println("Location= NEPAL");
    }
    public void vehicles_details2() {
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
class multiple{
    public static void main(String[]args){
        Car1 ak = new Car1();
        ak.vehicles_details();
        ak.vehicles_details2();
    }
}
