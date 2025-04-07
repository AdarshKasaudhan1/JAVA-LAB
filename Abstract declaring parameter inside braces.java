abstract class flower3{
    String flower_name;
    public abstract void Flower_details(String Flower_name,
                                        String Flower_color,
                                        String Flower_price,
                                        String Flower_size,
                                        String Flower_smell);{
    }
}
class lilly extends flower3{
    public void Flower_details(String Flower_name,
                               String Flower_color,
                               String Flower_price,
                               String Flower_size,
                               String Flower_smell){
        System.out.println("FLOWERS DETAILS");
        System.out.println("------------------");
        System.out.println("flower name  "+Flower_name);
        System.out.println("flower color  "+Flower_color);
        System.out.println("flower price  "+Flower_price);
        System.out.println("flower size  "+Flower_size);
        System.out.println("flower smell  "+Flower_smell);




    }
}

public class phool {
    public static void main(String[]args){
        lilly obj = new lilly();
        obj.Flower_details("lilly","white","140rs",
                "15sm","Pleasent");
    }
}
