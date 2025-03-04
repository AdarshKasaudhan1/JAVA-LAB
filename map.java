import java.util.Map;
import java .util.HashMap;
class map{
    public static void main(String[]args){
        Map<Integer,String>app=new HashMap<>();
//        System.out.println("COUNTRIES DETAILS");
//        System.out.println("----------------");
//        country.put(1,"India");
//       country.put(3,"Nepal");
//       country.put(2,"China");
//        System.out.println("Countries="+country);
        System.out.println("APPLIANCES DETAILS");
        System.out.println("==================");
        app.put(3,"Fridge");
        app.put(4,"Fan");
        app.put(2,"cooler");
        app.put(1,"Television");
        app.remove(2);
        for(Map.Entry<Integer,String>entry:app.entrySet()){
            System.out.println("Countries:"+entry.getKey()+":"+entry.getValue());
        }
    }
}
