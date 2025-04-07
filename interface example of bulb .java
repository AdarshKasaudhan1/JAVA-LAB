interface Electronic{
    void Appliances();
    void off();
}
class Bulb implements Electronic{
    public void Appliances(){
        System.out.println("*Bulb working*");
        System.out.println("--------------");
        System.out.println("Bulb is glowing");
    }
    public void off(){
        System.out.println("Bulb is turned  off");
    }
}
public class Glow {
    public static void main (String[]args){
        Bulb aks = new Bulb();
        aks.Appliances();
        aks.off();
    }
}
